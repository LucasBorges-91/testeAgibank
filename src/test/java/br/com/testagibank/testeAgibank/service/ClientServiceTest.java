package br.com.testagibank.testeAgibank.service;

import br.com.testagibank.testeAgibank.model.Client;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClientServiceTest {



    @Test
    void amountClients() {
        List<Client> clients = new ArrayList<>();
        Client client1 = new Client();
        Client client2 = new Client();
        Client client3 = new Client();
        clients.add( client1 );
        clients.add( client2 );
        clients.add( client3 );

        Assertions.assertEquals( 3, ClientService.amountClients( clients ) );
    }
}