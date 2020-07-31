package br.com.testagibank.testeAgibank.util;

import br.com.testagibank.testeAgibank.model.Seller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class WriteFile {

    public static void writeFile( File file, Integer amountSeller, Integer amountClients, Integer idMostExpansiveSale, Seller worstSeller ) {

        String[] lines = new String[] {
                    "Amount sellers: " + Integer.toString( amountSeller ),
                    "Amount clients: " + Integer.toString( amountClients ),
                    "Id most expansive sale: " + Integer.toString( idMostExpansiveSale ),
                    "Worst seller: " +  worstSeller
                };

        String fileName = file.getName().replaceFirst( "[.][^.]+$", "" ).toLowerCase();
        String str = file.getParent();
        System.out.println(str);
        String path = file.getParent().replace( "in", "out/" ) + fileName + ".done" + ".dat";

        try ( BufferedWriter bw = new BufferedWriter( new FileWriter( path ) ) ){
            Arrays.stream(lines).forEach( line -> {
                try {
                    bw.write( line );
                    bw.newLine();
                } catch ( IOException e ) {
                    e.printStackTrace();
                }
            });
        }
        catch ( IOException e ) {
            e.printStackTrace();
        }
    }
}
