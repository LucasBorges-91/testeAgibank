package br.com.testagibank.testeAgibank.util;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateDirectory {

    private static final Logger LOGGER = Logger.getLogger( CreateDirectory.class.getName() );


    public static void createAllDirectory( String directory ) {

        File dir = new File( System.getProperty("user.home") + "/" + directory );
        if ( !dir.exists() ) {
            dir.mkdir();
            LOGGER.log( Level.INFO, "Directory created "
                    + System.getProperty("user.home") + "/" + directory );
        }

        File fileIn = new File( dir.getPath() + "/in/" );
        if ( !fileIn.exists() ) {
            fileIn.mkdir();
            LOGGER.log( Level.INFO, "Directory created "
                    + dir.getPath() + "/in/" );
        }
        File fileOut = new File (dir.getPath() + "/out/" );
        if ( !fileOut.exists() ) {
            fileOut.mkdir();
            LOGGER.log( Level.INFO, "Directory created "
                    + dir.getPath() + "/out/" );
        }

        File fileBackup = new File( dir.getPath() + "/backup/" );
        if ( !fileBackup.exists() ) {
            fileBackup.mkdir();
            LOGGER.log( Level.INFO, "Directory created "
                    + dir.getPath() + "/backup/" );
        }
    }
}
