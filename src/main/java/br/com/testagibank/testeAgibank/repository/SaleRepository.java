package br.com.testagibank.testeAgibank.repository;

import br.com.testagibank.testeAgibank.model.Sale;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepository extends MongoRepository<Sale, Integer> {
}
