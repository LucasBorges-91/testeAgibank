package br.com.testagibank.testeAgibank.controller;

import br.com.testagibank.testeAgibank.model.FileDat;
import br.com.testagibank.testeAgibank.model.Seller;
import br.com.testagibank.testeAgibank.service.ClientService;
import br.com.testagibank.testeAgibank.service.ItemService;
import br.com.testagibank.testeAgibank.service.SaleService;
import br.com.testagibank.testeAgibank.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class FileController {

    @Autowired
    private SellerService serviceSeller;

    @Autowired
    private ClientService serviceClient;

    @Autowired
    private SaleService serviceSale;

    @Autowired
    private ItemService serviceItem;

    public Boolean saveSeller( FileDat fileDat ) {
        return serviceSeller.save( fileDat );
    }

    public Boolean saveClient( FileDat fileDat ) {
        return serviceClient.save( fileDat );
    }

    public Boolean saveSale( FileDat fileDat ) {
        return serviceSale.save( fileDat );
    }

    public Boolean saveItem( FileDat fileDat ) {
        return serviceItem.save( fileDat );
    }

    public Integer amountClients( FileDat fileDat ) {
        return serviceClient.amountClients( fileDat.getClients() );
    }

    public Integer amountSellers( FileDat fileDat ) {
        return serviceSeller.amountSellers( fileDat.getSellers() );
    }

    public Integer idMostExpansiveSale( FileDat fileDat ) {
        return  serviceSale.mostExpansiveSale( fileDat.getSales() );
    }

    public Seller worstSeller( FileDat fileDat ) {
        String worstSellerName =  serviceSale.worstSeller( fileDat.getSales() );
        return serviceSeller.findByName( worstSellerName );
    }
 }
