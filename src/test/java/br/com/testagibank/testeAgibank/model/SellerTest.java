package br.com.testagibank.testeAgibank.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SellerTest {

    @Test
    void getId() {
        Seller seller = new Seller();
        seller.setId( "14525636" );

        Assertions.assertEquals( "14525636", seller.getId() );
    }

    @Test
    void getCpf() {
        Seller seller = new Seller();
        seller.setCpf( "0000000000013" );

        Assertions.assertEquals( "0000000000013", seller.getCpf() );
    }

    @Test
    void getName() {
        Seller seller = new Seller();
        seller.setName( "Lucas" );

        Assertions.assertEquals( "Lucas", seller.getName() );
    }

    @Test
    void getSalary() {
        Seller seller = new Seller();
        seller.setSalary( 5000.00 );

        Assertions.assertEquals( 5000, seller.getSalary() );
    }
}