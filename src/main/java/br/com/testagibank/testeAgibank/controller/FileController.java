package br.com.testagibank.testeAgibank.controller;

import br.com.testagibank.testeAgibank.model.FileDat;
import br.com.testagibank.testeAgibank.service.ClientService;
import br.com.testagibank.testeAgibank.service.SaleService;
import br.com.testagibank.testeAgibank.service.SellerService;

public class FileController {

    public Integer amountClients( FileDat fileDat ) {
        return ClientService.amountClients( fileDat.getClients() );
    }

    public Integer amountSellers( FileDat fileDat ) {
        return SellerService.amountSellers( fileDat.getSellers() );
    }

    public Integer idMostExpansiveSale( FileDat fileDat ) {
        return  SaleService.mostExpansiveSale( fileDat.getSales() );
    }

    public String worstSeller( FileDat fileDat ) {
        return SaleService.worstSeller( fileDat.getSales() );
    }
 }
