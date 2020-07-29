package br.com.testagibank.testeAgibank;

import br.com.testagibank.testeAgibank.controller.FileController;
import br.com.testagibank.testeAgibank.model.FileDat;
import br.com.testagibank.testeAgibank.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.WatchService;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class TesteAgibankApplication implements CommandLineRunner {

	@Autowired
	FileController fileController;

	public static void main(String[] args) {


		SpringApplication.run(TesteAgibankApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception, IOException, InterruptedException {

		WatchService watcher = FileSystems.getDefault().newWatchService();
		Path diretorio = Paths.get("/home/lucas/data/in/");
		diretorio.register( watcher, StandardWatchEventKinds.ENTRY_CREATE );

		while (true) {
			WatchKey key = watcher.take();
			Optional<WatchEvent<?>> watchEvent = key.pollEvents().stream().findFirst();
			if ( watchEvent.isPresent() ) {
				if ( watchEvent.get().kind() == StandardWatchEventKinds.OVERFLOW ) {
					continue;
				}
				Path path = (Path) watchEvent.get().context();

				File dir = new File( diretorio + "/" + path );

				List<String> file = ReadFile.readFile( dir );

				FileDat fileDat = CreateModels.createModel( file );

				WriteFile.writeFile( dir,  fileController.amountSellers( fileDat ), fileController.amountClients( fileDat ), fileController.idMostExpansiveSale( fileDat ), fileController.worstSeller( fileDat ) );

				fileController.saveSeller( fileDat );

				fileController.saveClient( fileDat );

				fileController.saveSale( fileDat );

				fileController.saveItem( fileDat );

				MovingFile.movingFile( dir );

			}

			boolean valid = key.reset();
			if (!valid) {
				break;
			}
		}

		watcher.close();
	}
}

