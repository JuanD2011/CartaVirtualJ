package com.restaurant.juandavid.cartavirtualj;

public class Product {
    private int image;
    private String name;
    private String cost;

    public Product(int image, String name, String cost)
    {
        this.image = image;
        this.name = name;
        this.cost = cost;
    }

    public int getProductImage(){return image;}
    public String getProductName() {return name;}
    public String getProductCost() {return cost;}
}
