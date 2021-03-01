package com.codecool.petshop.model;

import java.util.Date;

public class FishFood extends Food {
    public FishFood(long id, Brand brand, FoodType foodType, String name, Date goodUntil, int quantityOnStock) {
        super(id, brand, foodType, name, goodUntil, quantityOnStock);
    }
}
