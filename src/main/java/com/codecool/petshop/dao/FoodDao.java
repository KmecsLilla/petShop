package com.codecool.petshop.dao;

import com.codecool.petshop.model.Brand;
import com.codecool.petshop.model.Food;

import java.util.List;

public interface FoodDao {
    Food findFoodById(long id);
    List<Food> findAllFoodOnStock();
    List<Food> findAllFood();
    List<Food> findAllFoodByBrand(Brand brand);
}
