package com.codecool.petshop.model;

import java.util.Date;

public class CatFood extends Food {
    public CatFood(long id,Brand brand, FoodType foodType, String name, Date goodUntil, int quantityOnStock) {
        super(id, brand, foodType, name, goodUntil, quantityOnStock);
    }
}
