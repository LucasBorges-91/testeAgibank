package br.com.testagibank.testeAgibank.model;

public class Seller {

    private String cpf;
    private String name;
    private Double salary;

    public Seller() {}

    public Seller( String cpf, String name, Double salary ) {
        this.cpf = cpf;
        this.name = name;
        this.salary = salary;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf( String cpf ) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary( Double salary ) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "cpf='" + cpf + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
