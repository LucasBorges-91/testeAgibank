package br.com.testagibank.testeAgibank.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document( collection = "client" )
public class Client {

    @Id
    private String id;
    @Indexed ( unique = true, sparse = true )
    private String cnpj;
    private String name;
    private String businessArea;

    public Client() {}

    public Client( String cnpj, String name, String businessArea ) {
        this.cnpj = cnpj;
        this.name = name;
        this.businessArea = businessArea;
    }

    public String getId() {
        return id;
    }

    public void setId( String id ) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj( String cnpj ) {
        this.cnpj = cnpj;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getBusinessArea() {
        return businessArea;
    }

    public void setBusinessArea( String businessArea ) {
        this.businessArea = businessArea;
    }

    @Override
    public String toString() {
        return "Client{" +
                "cnpj='" + cnpj + '\'' +
                ", name='" + name + '\'' +
                ", businessArea='" + businessArea + '\'' +
                '}';
    }
}
