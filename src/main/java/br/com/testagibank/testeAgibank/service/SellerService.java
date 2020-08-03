package br.com.testagibank.testeAgibank.service;

import br.com.testagibank.testeAgibank.model.Seller;

import java.util.List;

public class SellerService {

    public static Integer amountSellers(List<Seller> sellers) {
        return sellers.size();
    }
}
