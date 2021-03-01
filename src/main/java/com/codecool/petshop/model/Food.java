package com.codecool.petshop.model;

import java.util.Date;

public abstract class Food {
    private long id;
    private Brand brand;
    private FoodType foodType;
    private String name;
    private Date goodUntil;
    private int quantityOnStock;

    public Food(long id, Brand brand, FoodType foodType, String name, Date goodUntil, int quantityOnStock) {
        this.id = id;
        this.brand = brand;
        this.foodType = foodType;
        this.name = name;
        this.goodUntil = goodUntil;
        this.quantityOnStock = quantityOnStock;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Brand getBrand() {
        return brand;
    }

    public FoodType getType() {
        return foodType;
    }

    public String getName() {
        return name;
    }

    public Date getGoodUntil() {
        return goodUntil;
    }

    public int getQuantityOnStock() {
        return quantityOnStock;
    }

    @Override
    public String toString() {
        return "\n" + "\n" + "Food {" +
            "id=" + id +
            ", " + "\n" + "brand=" + brand +
            ", " + "\n" + "foodType=" + foodType +
            ", " + "\n" + "name=" + name +
            ", " + "\n" + "quantityOnStock=" + quantityOnStock + "}";

    }
}
