package br.com.testagibank.testeAgibank.repository;

import br.com.testagibank.testeAgibank.model.Seller;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepository extends MongoRepository<Seller, String> {

    Seller findByCpf( String cpf );
}
