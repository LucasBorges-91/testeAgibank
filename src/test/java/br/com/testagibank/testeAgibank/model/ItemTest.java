package br.com.testagibank.testeAgibank.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ItemTest {

    @Test
    void getId() {
        Item item = new Item();
        item.setId( 10 );

        Assertions.assertEquals( 10, item.getId() );
    }

    @Test
    void getQuantity() {
        Item item = new Item();
        item.setQuantity( 1253 );

        Assertions.assertEquals( 1253, item.getQuantity() );
    }

    @Test
    void getPrice() {
        Item item = new Item();
        item.setPrice( 0.10 );

        Assertions.assertEquals( 0.10, item.getPrice() );
    }
}