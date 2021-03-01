package com.codecool.petshop.service;

import com.codecool.petshop.model.FoodType;

public class SellingImpl implements Selling {
    @Override
    public boolean isAvailable(FoodType foodType, int pieces) {
        return false;
    }
}
