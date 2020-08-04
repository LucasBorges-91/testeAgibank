package br.com.testagibank.testeAgibank.service;

import br.com.testagibank.testeAgibank.model.Item;
import br.com.testagibank.testeAgibank.model.Sale;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class SaleServiceTest {

    @Test
    void mostExpansiveSale() {
        List<Item> itensSale1 = new ArrayList<>();
        List<Item> itensSale2 = new ArrayList<>();
        Item item = new Item( 1, 20, 10.0 );
        Item item2 = new Item( 2, 10, 50.0 );
        Item item3 = new Item( 3, 5, 05.0 );
        itensSale1.add( item );
        itensSale1.add( item2 );
        itensSale1.add( item3 );
        itensSale2.add( item2 );
        itensSale2.add( item3 );
        List<Sale> sales = new ArrayList<>();
        Sale sale1 = new Sale( 1, itensSale1, "Lucas" );
        Sale sale2 = new Sale( 2, itensSale2, "Marcos" );
        sales.add( sale1 );
        sales.add( sale2 );

        Assertions.assertEquals( 1, SaleService.mostExpansiveSale( sales ) );
    }

    @Test
    void salePrice() {
        List<Item> itensSale = new ArrayList<>();
        Item item = new Item( 1, 20, 10.0 );
        Item item2 = new Item( 2, 10, 50.0 );
        Item item3 = new Item( 3, 5, 5.0 );
        itensSale.add( item );
        itensSale.add( item2 );
        itensSale.add( item3 );
        Sale sale = new Sale( 1, itensSale, "Lucas" );

        Assertions.assertEquals( 725.00, SaleService.salePrice( sale ) );
    }


    @Test
    void worstSeller() {
        List<Item> itensSale1 = new ArrayList<>();
        List<Item> itensSale2 = new ArrayList<>();
        Item item = new Item( 1, 20, 10.0 );
        Item item2 = new Item( 2, 10, 50.0 );
        Item item3 = new Item( 3, 05, 05.0 );
        itensSale1.add( item );
        itensSale1.add( item2 );
        itensSale1.add( item3 );
        itensSale2.add( item2 );
        itensSale2.add( item3 );
        List<Sale> sales = new ArrayList<>();
        Sale sale1 = new Sale( 1, itensSale1, "Lucas" );
        Sale sale2 = new Sale( 2, itensSale2, "Marcos" );
        sales.add( sale1 );
        sales.add( sale2 );

        Assertions.assertEquals( "Marcos", SaleService.worstSeller( sales ) );
    }
}