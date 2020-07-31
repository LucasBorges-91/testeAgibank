package br.com.testagibank.testeAgibank.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class ReadFileTest {

    @Test
    void readFileEmpty() throws IOException {
        File file = new File( "/home/lucas/dataTest/in/testReader.dat" );

        Assertions.assertEquals( 1, ReadFile.readFile( file ).size() );
    }

    @Test
    void readFileCountLines() {
        File file = new File( "/home/lucas/dataTest/in/testReader.dat" );

        Assertions.assertEquals( "File read", ReadFile.readFile( file ).get( 0 ) );
    }
}