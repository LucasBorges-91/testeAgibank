package br.com.testagibank.testeAgibank.service;

import br.com.testagibank.testeAgibank.model.FileDat;
import br.com.testagibank.testeAgibank.model.Item;
import br.com.testagibank.testeAgibank.model.Sale;
import br.com.testagibank.testeAgibank.model.Seller;
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
                .filter( sale -> sale.getId() != null && sale.getItens() != null && sale.getSalesmanName() != "" )
                .forEach( sale -> repository.save( sale ) );
        return true;
    }

    public Integer mostExpansiveSale( List<Sale> sales ) {
        Double saleExpansiveValue = 0.0;
        Integer saleExpansiveId = 0;

        for ( Sale sale: sales ) {
            List<Item> itens = sale.getItens();
            for ( Item item: itens ) {
                double subtotal =+ item.getPrice() * item.getQuantity();
                if ( subtotal > saleExpansiveValue ) {
                    saleExpansiveValue = subtotal;
                    saleExpansiveId = sale.getId();
                }
            }
        }
        return saleExpansiveId;
    }

//    public String worstSeller( List<Sale> sales, List<Seller> sellers ) {
//
//    }

}
