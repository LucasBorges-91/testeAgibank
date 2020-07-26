package br.com.testagibank.testeAgibank.service;

import br.com.testagibank.testeAgibank.model.FileDat;
import br.com.testagibank.testeAgibank.model.Sale;
import br.com.testagibank.testeAgibank.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SaleService {

    @Autowired
    SaleRepository repository;

    public Boolean save( FileDat fileDat ) {
        List<Sale> sales = fileDat.getSales();
        sales.stream()
                .filter( sale -> sale.getId() != null && sale.getItem() != null && sale.getSalesmanName() != "" )
                .forEach( sale -> repository.save( sale ) );
        return true;
    }
}
