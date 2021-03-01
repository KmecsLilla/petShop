package com.codecool.petshop.service;

import com.codecool.petshop.model.FoodType;

public interface Selling {
    boolean isAvailable(FoodType foodType, int pieces);
}
