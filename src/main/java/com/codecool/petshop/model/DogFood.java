package com.codecool.petshop.model;

import java.sql.Date;

public class DogFood extends Food {

    public DogFood(long id,Brand brand, FoodType foodType, String name, Date goodUntil, int quantityOnStock) {
        super(id, brand, foodType, name, goodUntil, quantityOnStock);
    }
}
