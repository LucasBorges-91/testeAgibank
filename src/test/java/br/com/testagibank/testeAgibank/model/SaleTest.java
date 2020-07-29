package br.com.testagibank.testeAgibank.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

class SaleTest {

    @Test
    void getId() {
        Sale sale = new Sale();
        sale.setId( 54 );

        Assertions.assertEquals( 54, sale.getId() );
    }

    @Test
    void getItens() {
        Sale sale = new Sale();
        List<Item> itens = new ArrayList<>();
        Item item = new Item();
        Item item2 = new Item();
        itens.add(item);
        itens.add(item2);
        sale.setItens(itens);


        Assertions.assertNotNull( sale.getItens() );
    }

    @Test
    void getSalesmanName() {
        Sale sale = new Sale();
        sale.setSalesmanName( "Lucas" );

        Assertions.assertEquals( "Lucas", sale.getSalesmanName() );
    }
}