package br.com.testagibank.testeAgibank.util;

import java.io.File;

public class MovingFile {

    public static Boolean movingFile(File file ) {
        File source = new File( file.getPath() );
        File dest = new File( "/home/lucas/data/backup/" + file.getName() );
        return source.renameTo( dest );
    }
}