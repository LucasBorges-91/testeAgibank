package br.com.testagibank.testeAgibank.util;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;


import static org.junit.jupiter.api.Assertions.*;

class CreateDirectoryTest {

    @Test
    void createAllDirectory() {

        CreateDirectory.createAllDirectory( "dataTestCreate" );

        File file = new File( "/home/lucas/dataTestCreate" );
        File file1 = new File( "/home/lucas/dataTestCreate/in" );
        File file2 = new File( "/home/lucas/dataTestCreate/out" );
        File file3 = new File( "/home/lucas/dataTestCreate/backup" );



        Assertions.assertEquals( true, file.exists() );
        Assertions.assertEquals( true, file1.exists() );
        Assertions.assertEquals( true, file2.exists() );
        Assertions.assertEquals( true, file3.exists() );

        boolean delete3 = file3.delete();
        boolean delete2 = file2.delete();
        boolean delete1 = file1.delete();
        boolean delete = file.delete();


    }
}