package br.com.testagibank.testeAgibank.util;

import java.io.File;

public class CreateDirectory {

    public static void createAllDirectory( String directory ) {

        File dir = new File( System.getProperty("user.home") + "/" + directory );
        if ( !dir.exists() ) {
            dir.mkdir();
        }

        File fileIn = new File( System.getProperty("user.home") + "/" + directory + "/in/" );
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
