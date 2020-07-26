package br.com.testagibank.testeAgibank.service;

import br.com.testagibank.testeAgibank.model.Client;
import br.com.testagibank.testeAgibank.model.FileDat;
import br.com.testagibank.testeAgibank.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    public Boolean save( FileDat fileDat ) {
        List<Client> clients = fileDat.getClients();
        clients.stream()
                .filter( client -> client.getCnpj().length() == 16 && client.getName() != "" && client.getBusinessArea() != "" )
                .forEach( client -> repository.save( client ) );
        return true;
    }

    public Integer amountClients( List<Client> clients ) {
        return clients.size();
    }
}
