package com.company.lab3.AnimalRescue;

public class AnimalFood {
    private String name;
    private int price;
    private int quantity;
    private String disponibility;

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setDisponibility(String disponibility) {
        this.disponibility = disponibility;
    }

    public String getDisponibility() {
        return disponibility;
    }

}
