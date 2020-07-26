package br.com.testagibank.testeAgibank.service;

import br.com.testagibank.testeAgibank.model.FileDat;
import br.com.testagibank.testeAgibank.model.Seller;
import br.com.testagibank.testeAgibank.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SellerService {

    @Autowired
    private SellerRepository repository;

    public Boolean save( FileDat fileDat ) {
        List<Seller> sellers = fileDat.getSellers();
        sellers.stream()
                .filter( seller -> seller.getCpf().length() == 13 && seller.getName() != "" && seller.getSalary() > 0 )
                .forEach( seller -> repository.save( seller ) );
        return true;
    }
}