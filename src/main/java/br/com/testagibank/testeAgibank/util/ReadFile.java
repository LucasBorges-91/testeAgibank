package br.com.testagibank.testeAgibank.util;

import br.com.testagibank.testeAgibank.util.exceptions.ExtensionException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

    public static List<String> readFile( File file ) {
        List<String> lines = new ArrayList<>();
        if ( ValidateExtension.isDAT( file ) ) {
            try ( BufferedReader br = new BufferedReader( new FileReader( file.getPath() ) ) ) {
                String line = br.readLine();
                while ( line != null ) {
                    lines.add( line );
                    line = br.readLine();
                }
            }catch ( IOException e ) {
                System.out.println( "Error reading file: " + e.getMessage() );
            }
        } else {
            throw new ExtensionException( "Extension invalid format." );
        }
        return lines;
    }
}
