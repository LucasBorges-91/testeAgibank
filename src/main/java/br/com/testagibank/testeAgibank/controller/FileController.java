package br.com.testagibank.testeAgibank.controller;

import br.com.testagibank.testeAgibank.model.FileDat;
import br.com.testagibank.testeAgibank.service.SaleService;

public class FileController {

    SaleService saleService = new SaleService();

    public Integer amountClients( FileDat fileDat ) {
        return fileDat.getClients().size();
    }

    public Integer amountSellers( FileDat fileDat ) {
        return fileDat.getSellers().size();
    }

    public Integer idMostExpansiveSale( FileDat fileDat ) {
        return  saleService.mostExpansiveSale( fileDat.getSales() );
    }

    public String worstSeller( FileDat fileDat ) {
        return saleService.worstSeller( fileDat.getSales() );
    }
 }
