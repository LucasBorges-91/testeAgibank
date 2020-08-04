package br.com.testagibank.testeAgibank.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class ValidateExtensionTest {

    @Test
    void isDAT() {
        File file = new File( "/home/lucas/dataTest/in/testReader.dat" );
        File isNotDat = new File( "/home/lucas/dataTest/in/testReader.txt" );


        Assertions.assertEquals( true, ValidateExtension.isDAT( file ) );
        Assertions.assertEquals( false, ValidateExtension.isDAT( isNotDat ) );
    }
}