package br.com.testagibank.testeAgibank.service;

import br.com.testagibank.testeAgibank.model.Seller;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SellerServiceTest {

    @Test
    void amountSellers() {
        SellerService service = new SellerService();
        List<Seller> sellers = new ArrayList<>();
        Seller seller1 = new Seller();
        Seller seller2 = new Seller();
        Seller seller3 = new Seller();
        sellers.add( seller1 );
        sellers.add( seller2 );
        sellers.add( seller3 );

        Assertions.assertEquals( 3, service.amountSellers( sellers ) );
    }
}