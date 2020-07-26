package br.com.testagibank.testeAgibank.util;

import org.springframework.data.mongodb.util.BsonUtils;

import javax.crypto.spec.PSource;
import java.io.File;

public class ValidateExtension {

    public static Boolean isDAT( File file ) {
        return file.getName().endsWith( ".dat" );
    }

}
