package br.com.testagibank.testeAgibank.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document( collection = "item" )
public class Item {

    @Id
    private Integer id;
    private Integer quantity;
    private Double price;

    public Item() {}

    public Item( Integer id, Integer quantity, Double price ) {
        this.id = id;
        this.quantity = quantity;
        this.price = price;
    }

    public Item( Integer id, Double price ) {
        this.id = id;
        this.price =price;
    }

    public Integer getId() {
        return id;
    }

    public void setId( Integer id ) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity( Integer quantity ) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice( Double price ) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
