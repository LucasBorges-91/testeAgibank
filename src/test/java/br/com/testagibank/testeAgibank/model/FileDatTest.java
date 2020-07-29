package br.com.testagibank.testeAgibank.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

class FileDatTest {

    @Test
    void getClients() {
        Client client1 = new Client();
        Client client2 = new Client();
        List<Client> clients = new ArrayList<>();
        clients.add( client1 );
        clients.add( client2 );
        FileDat fileDat = new FileDat();
        fileDat.setClients( clients );

        Assertions.assertNotNull( fileDat.getClients() );
    }

    @Test
    void getSellers() {
        Seller seller = new Seller();
        Seller seller1 = new Seller();
        List<Seller> sellers = new ArrayList<>();
        sellers.add( seller );
        sellers.add( seller1 );
        FileDat fileDat = new FileDat();
        fileDat.setSellers( sellers );

        Assertions.assertNotNull( fileDat.getSellers() );
    }

    @Test
    void getItens() {
        Item item1 = new Item();
        Item item2 = new Item();
        List<Item> itens = new ArrayList<>();
        itens.add( item1 );
        itens.add( item2 );
        FileDat fileDat = new FileDat();
        fileDat.setItens( itens );

        Assertions.assertNotNull( fileDat.getItens() );
    }

    @Test
    void getSales() {
        Sale sale1 = new Sale();
        Sale sale2 = new Sale();
        List<Sale> sales = new ArrayList<>();
        sales.add( sale1 );
        sales.add( sale2 );
        FileDat fileDat = new FileDat();
        fileDat.setSales( sales );

        Assertions.assertNotNull( fileDat.getSales() );
    }
}