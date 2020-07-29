package br.com.testagibank.testeAgibank.service;

import br.com.testagibank.testeAgibank.model.FileDat;
import br.com.testagibank.testeAgibank.model.Item;
import br.com.testagibank.testeAgibank.model.Sale;
import br.com.testagibank.testeAgibank.model.Seller;
import br.com.testagibank.testeAgibank.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class SaleService {

    @Autowired
    SaleRepository repository;

    public Boolean save( FileDat fileDat ) {
        List<Sale> sales = fileDat.getSales();

        sales.stream()
                .filter( sale -> sale.getId() != null && sale.getItens() != null && sale.getSalesmanName() != "" )
                .filter( sale -> saleIdCheck( sale.getId() ) )
                .forEach( sale -> repository.save( sale ) );
        return true;
    }

    public Boolean saleIdCheck( Integer id ) {
        Optional<Sale> sale = repository.findById( id );

        return sale.isEmpty() ? false: true;
    }

    public Integer mostExpansiveSale( List<Sale> sales ) {
        Double saleExpansiveValue = 0.0;
        Integer saleExpansiveId = 0;

        for ( Sale sale: sales ) {
            double subtotal = salePrice( sale );
                if ( subtotal > saleExpansiveValue ) {
                    saleExpansiveValue = subtotal;
                    saleExpansiveId = sale.getId();
                }
        }
        return saleExpansiveId;
    }

    public Double salePrice( Sale sale ) {
        double total = 0.0;

        for ( Item item: sale.getItens() ) {
            total += item.getPrice() * item.getQuantity();
        }
        return total;
    }

    public String worstSeller( List<Sale> sales ) {
        String wSeller = "";
        double subtotal = 0.0;
        Map<String, Double > sellers = new HashMap<>();

        for ( Sale sale: sales ) {
            wSeller = sale.getSalesmanName();
            for ( Sale s: sales ) {
                if ( wSeller.equals( s.getSalesmanName() ) ) {
                   subtotal = salePrice( s );
                }
            }
            sellers.put( wSeller, subtotal );
        }

        subtotal = sellers.get( sales.get( 0 ).getSalesmanName() );

        for ( String name: sellers.keySet() ) {
            if ( sellers.get( name ) <= subtotal ) {
                wSeller = name;
                subtotal = sellers.get( name );
            }
        }
        return wSeller;
    }

}
