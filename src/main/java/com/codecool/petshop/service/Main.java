package com.codecool.petshop.service;

import com.codecool.petshop.dao.*;
import com.codecool.petshop.model.Brand;
import com.codecool.petshop.model.CatFood;
import com.codecool.petshop.model.DogFood;
import com.codecool.petshop.model.FishFood;

public class Main {
    /*public static void main1(String[] args) {
        CatFoodDao catFoodDao = new CatFoodDaoImpl(PetShopDatabaseManager.connect());
        CatFood catFood = (CatFood) catFoodDao.findFoodById(1);
        System.out.println(catFood);*/

    public static void main(String[] args) {
//        FishFoodDao fishFoodDao = new FishFoodDaoImpl(PetShopDatabaseManager.connect());
//        FishFood fishFood = (FishFood) fishFoodDao.findFoodById(2);
//        System.out.println(fishFood);
//        System.out.println(fishFoodDao.findAllFood());
//        System.out.println(fishFoodDao.findAllFoodOnStock());
//        System.out.println(fishFoodDao.findAllFoodByBrand(Brand.HIKARI));


        DogFoodDao dogFoodDao = new DogFoodDaoImpl(PetShopDatabaseManager.connect());
        DogFood dogFood = (DogFood) dogFoodDao.findFoodById(3);
        System.out.println(dogFood);
        System.out.println(dogFoodDao.findAllFood());
        System.out.println(dogFoodDao.findAllFoodOnStock());
        System.out.println("********************************************************");
        System.out.println(dogFoodDao.findAllFoodByBrand(Brand.FLUVAL));



//        CatFoodDao catFoodDao = new CatFoodDaoImpl(PetShopDatabaseManager.connect());
//        CatFood catFood = (CatFood) catFoodDao.findFoodById(4);
//        System.out.println(catFood);
//        System.out.println(catFoodDao.findAllFood());
//        System.out.println(catFoodDao.findAllFoodOnStock());
//        System.out.println("********************************************************");
//        System.out.println(catFoodDao.findAllFoodByBrand(Brand.WHISKAS));
    }
}
