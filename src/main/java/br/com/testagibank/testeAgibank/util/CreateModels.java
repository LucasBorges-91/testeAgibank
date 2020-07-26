package br.com.testagibank.testeAgibank.util;

import br.com.testagibank.testeAgibank.model.*;

import java.util.ArrayList;
import java.util.List;

public class CreateModels {

    public static FileDat createModel(List<String> lineFile ) {
        List<Seller> sellers = new ArrayList<>();
        List<Client> clients = new ArrayList<>();
        List<Item> itens = new ArrayList<>();
        List<Sale> sales = new ArrayList<>();
        for ( Object model: lineFile ) {
            String[] fields = model.toString().split("ç");
            Integer identity = Integer.parseInt( fields[0] );
            switch ( identity ) {
                case 1:
                    sellers.add( new Seller( fields[1], fields[2], Double.parseDouble(fields[3]) ) );
                    break;
                case 2:
                    clients.add( new Client( fields[1], fields[2], fields[3] ) );
                    break;
                case 3:
                    String[] subFilds = fields[2].replace("[", "").replace("]", "").split(",");
                    for ( String string: subFilds ) {
                        subFilds = string.split( "-" );
                        itens.add( new Item( Integer.parseInt( subFilds[0] ) , Integer.parseInt( subFilds[1] ), Double.parseDouble( subFilds[2]  ) ) );
                    }
                    sales.add( new Sale( Integer.parseInt( fields[1] ), itens, fields[3] ) );
                    break;
            }
        }
        return new FileDat( sellers, clients, itens, sales );
    }
}
