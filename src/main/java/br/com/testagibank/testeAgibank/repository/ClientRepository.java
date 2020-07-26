package br.com.testagibank.testeAgibank.repository;

import br.com.testagibank.testeAgibank.model.Client;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends MongoRepository<Client, String> {
}
