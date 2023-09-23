package com.smsoft.ch17streamelement.ex04collection;

public class Product {
    private int productNo;
    private String name;
    private String company;
    private int price;

    public Product (int productNo, String name, String company, int price) {
        this.productNo = productNo;
        this.name = name;
        this.company = company;
        this.price = price;
    }

    public int getProductNo() { return productNo; }
    public String getName() { return name; }
    public String getCompany() { return company; }
    public int getPrice() { return price; }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("{")
                .append("productNo:" + productNo + ", ")
                .append("name:" + name + ", ")
                .append("company:" + company + ", ")
                .append("price:" + price)
                .append("}")
                .toString();
    }
}
