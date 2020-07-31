package br.com.testagibank.testeAgibank.util;

import br.com.testagibank.testeAgibank.model.Seller;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class WriteFileTest {

    @Test
    void writeFile() throws IOException {
        File dir = new File ( "/home/lucas/dataTest/out/" );
        File file = new File( "/home/lucas/dataTest/in/testWrite.dat" );
        int sellers = 2;
        int clients = 3;
        int idSale = 23;
        Seller seller = new Seller( "0000000000013", "Lucas", 500.00 );

        Assertions.assertEquals( 0, dir.list().length);

        WriteFile.writeFile( file, sellers, clients, idSale, seller );

        Assertions.assertEquals( 1, dir.list().length);
        Files.delete(Path.of("/home/lucas/dataTest/out/testwrite.done.dat"));
    }
}