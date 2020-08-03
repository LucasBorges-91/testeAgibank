package br.com.testagibank.testeAgibank.service;

import br.com.testagibank.testeAgibank.model.Client;

import java.util.List;

public class ClientService {

    public static Integer amountClients( List<Client> clients ) {
        return clients.size();
    }
}
