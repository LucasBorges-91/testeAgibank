package br.com.testagibank.testeAgibank.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document( collection = "sale" )
public class Sale {

    @Id
    private Integer id;
    private List<Item> itens;
    private String salesmanName;

    public Sale() {}

    public Sale( Integer id, List<Item> itens, String salesmanName ) {
        this.id = id;
        this.itens = itens;
        this.salesmanName = salesmanName;
    }

    public Integer getId() {
        return id;
    }

    public void setId( Integer id ) {
        this.id = id;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens( List<Item> itens ) {
        this.itens = itens;
    }

    public String getSalesmanName() {
        return salesmanName;
    }

    public void setSalesmanName( String salesmanName ) {
        salesmanName = salesmanName;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "id=" + id +
                ", itens=" + itens +
                ", SalesmanName='" + salesmanName + '\'' +
                '}';
    }
}
