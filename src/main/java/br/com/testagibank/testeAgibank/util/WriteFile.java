package br.com.testagibank.testeAgibank.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class WriteFile {

    public static void writeFile( File file, Integer amountSeller, Integer amountClients, Integer idMostExpansiveSale ) {

        String[] lines = new String[] {
                    "Amount sellers: " + Integer.toString( amountSeller ),
                    "Amount clients: " + Integer.toString( amountClients ),
                    "Id most expansive sale: " + Integer.toString( idMostExpansiveSale )
                };

        String fileName = file.getName().replaceFirst("[.][^.]+$", "");;

        String path = "/home/lucas/data/out/" + fileName + ".done" + ".dat";


        try ( BufferedWriter bw = new BufferedWriter( new FileWriter( path ) ) ){
            Arrays.stream(lines).forEach( line -> {
                try {
                    bw.write( line );
                    bw.newLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }
        catch ( IOException e ) {
            e.printStackTrace();
        }
    }
}