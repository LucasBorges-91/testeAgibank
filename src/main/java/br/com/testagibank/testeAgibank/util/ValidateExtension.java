package br.com.testagibank.testeAgibank.util;

import java.io.File;

public class ValidateExtension {

    public static Boolean isDAT( File file ) {
        return file.getName().endsWith( ".dat" );
    }
}
