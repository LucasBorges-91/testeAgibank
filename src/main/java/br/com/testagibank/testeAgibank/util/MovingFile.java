package br.com.testagibank.testeAgibank.util;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MovingFile {

    private static final Logger LOGGER = Logger.getLogger( MovingFile.class.getName() );

    public static Boolean movingFile(File file ) {
        File source = new File( file.getPath() );
        File dest = new File( System.getProperty("user.home")
                + "/data/backup/" + file.getName() );

        if (!source.renameTo(dest)) {
            LOGGER.log(Level.WARNING, "Error to moving file");
        }
        return source.renameTo( dest );
    }
}
