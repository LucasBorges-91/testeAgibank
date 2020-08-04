package br.com.testagibank.testeAgibank.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ClientTest {

    @Test
    void getCnpj() {
        Client client = new Client();
        client.setCnpj( "1234567891234567" );

        Assertions.assertEquals( "1234567891234567", client.getCnpj() );
    }

    @Test
    void getName() {
        Client client = new Client();
        client.setName( "Lucas" );

        Assertions.assertEquals( "Lucas", client.getName() );
    }

    @Test
    void getBusinessArea() {
        Client client = new Client();
        client.setBusinessArea( "Rural" );

        Assertions.assertEquals( "Rural", client.getBusinessArea() );
    }


}