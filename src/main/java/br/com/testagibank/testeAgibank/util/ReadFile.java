package br.com.testagibank.testeAgibank.util;

import br.com.testagibank.testeAgibank.util.exceptions.ExtensionException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadFile {

    private static final Logger LOGGER = Logger.getLogger( ReadFile.class.getName() );

    public static List<String> readFile( File file ) {

        List<String> lines = new ArrayList<>();
        if ( ValidateExtension.isDAT( file ) ) {
            try ( BufferedReader br = new BufferedReader( new FileReader( file.getPath() ) ) ) {
                String line = br.readLine();
                while ( line != null ) {
                    if ( !line.startsWith( "00" ) ) {
                        lines.set( lines.size() -1 , lines.get( lines.size() -1 ).concat( line ) );
                        line = br.readLine();
                    } else {
                        lines.add( line );
                        line = br.readLine();
                    }
                }
            }catch ( IOException e ) {
                LOGGER.log( Level.SEVERE, "Error reading file: " + e.getMessage() );
            }
        } else {
            LOGGER.log( Level.WARNING, new ExtensionException( "Extension invalid format." ).getMessage() );
        }
        return lines;
    }
}