package br.com.testagibank.testeAgibank;

import br.com.testagibank.testeAgibank.controller.FileController;
import br.com.testagibank.testeAgibank.model.FileDat;
import br.com.testagibank.testeAgibank.util.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.WatchService;
import java.util.List;
import java.util.Optional;


public class TesteAgibankApplication {

	public static void main(String[] args) throws IOException, InterruptedException {

		FileController fileController = new FileController();

		CreateDirectory.createAllDirectory( "data" );

		WatchService watcher = FileSystems.getDefault().newWatchService();
		Path directory = Paths.get( System.getProperty("user.home") + "/data/in/" );
		directory.register( watcher, StandardWatchEventKinds.ENTRY_CREATE );

		while (true) {
			WatchKey key = watcher.take();
			Optional<WatchEvent<?>> watchEvent = key.pollEvents().stream().findFirst();
			if ( watchEvent.isPresent() ) {
				if ( watchEvent.get().kind() == StandardWatchEventKinds.OVERFLOW ) {
					continue;
				}
				Path path = (Path) watchEvent.get().context();

				File dir = new File( directory + "/" + path );

				List<String> file = ReadFile.readFile( dir );

				FileDat fileDat = CreateModels.createModel( file );

				WriteFile.writeFile( dir,  fileController.amountSellers( fileDat ),
						fileController.amountClients( fileDat ),
						fileController.idMostExpansiveSale( fileDat ),
						fileController.worstSeller( fileDat ) );

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

