package br.com.testagibank.testeAgibank.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class MovingFileTest {

    @Test
    void movingFile() throws IOException {
        File file = new File( "/home/lucas/dataTest/in/testMove.dat" );

        Assertions.assertEquals( true, MovingFile.movingFile( file ) );

        Files.delete( Path.of( System.getProperty("user.home") + "/data/backup/" + file.getName() ) );
    }
}