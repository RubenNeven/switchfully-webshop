package com.switchfully.webshop.domain.item;

public class ItemDto {
    private String id;
    private String name;
    private double price;
    private int amount;

    public ItemDto setId(String id) {
        this.id = id;
        return this;
    }

    public ItemDto setName(String name) {
        this.name = name;
        return this;
    }

    public ItemDto setPrice(double price) {
        this.price = price;
        return this;
    }

    public ItemDto setAmount(int amount) {
        this.amount = amount;
        return this;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }
}
