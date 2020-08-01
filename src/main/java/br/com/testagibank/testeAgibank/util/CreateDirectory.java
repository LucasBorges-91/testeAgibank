package br.com.testagibank.testeAgibank.util;

import java.io.File;

public class CreateDirectory {

    public static void createAllDirectory() {

        File fileIn = new File( System.getProperty("user.home") + "/data/in/" );
        System.out.println( System.getProperty("user.home") );
        if ( !fileIn.exists() ) {
            fileIn.mkdir();
        }
        File fileOut = new File (fileIn.getParent() + "/out/" );

        if ( !fileOut.exists() ) {
            fileOut.mkdir();
        }

        File fileBackup = new File( fileIn.getParent() + "/backup/" );

        if ( !fileBackup.exists() ) {
            fileBackup.mkdir();
        }
    }
}
