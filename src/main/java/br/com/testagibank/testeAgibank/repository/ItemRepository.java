package br.com.testagibank.testeAgibank.repository;

import br.com.testagibank.testeAgibank.model.Item;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends MongoRepository<Item, Integer> {
}
