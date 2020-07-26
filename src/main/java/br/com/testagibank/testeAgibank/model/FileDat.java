package br.com.testagibank.testeAgibank.model;

import java.util.List;

public class FileDat {

    private List<Seller> sellers;
    private List<Client> clients;
    private List<Item> itens;
    private List<Sale> sales;

    public FileDat(){}

    public FileDat( List<Seller> sellers, List<Client> clients, List<Item> itens, List<Sale> sales) {
        this.sellers = sellers;
        this.clients = clients;
        this.itens = itens;
        this.sales = sales;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public List<Seller> getSellers() {
        return sellers;
    }

    public void setSellers(List<Seller> sellers) {
        this.sellers = sellers;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public List<Sale> getSales() {
        return sales;
    }

    public void setSales(List<Sale> sales) {
        this.sales = sales;
    }

    @Override
    public String toString() {
        return "FileDat{" +
                "sellers=" + sellers +
                ", clients=" + clients +
                ", itens=" + itens +
                ", sales=" + sales +
                '}';
    }
}
