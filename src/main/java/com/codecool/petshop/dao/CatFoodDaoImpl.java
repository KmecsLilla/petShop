package com.codecool.petshop.dao;

import com.codecool.petshop.model.*;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CatFoodDaoImpl implements CatFoodDao {
    private DataSource dataSource;

    public CatFoodDaoImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public CatFood findFoodById(long id) {
        try (Connection connection = dataSource.getConnection()) {
            String sql = "SELECT id, brand, food_type, name, good_until, quantity_on_stock FROM cat_food WHERE id = ?";

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setLong(1, id);

            ResultSet rs = ps.executeQuery();
            if (!rs.next()) {
                return null;
            }
//            String animalType = rs.getString("animal_type");
//            if (!animalType.equals("CAT")) {
//                return null;
//            }
            Brand brand = Brand.valueOf(rs.getString("brand"));
            FoodType foodType = FoodType.valueOf(rs.getString("food_type"));
            String name = rs.getString("name");
            Date goodUntil = rs.getDate("good_until");
            int quantityOnStock = rs.getInt("quantity_on_stock");

            CatFood catFood = new CatFood(id, brand, foodType, name, goodUntil, quantityOnStock);
            return catFood;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Food> findAllFoodOnStock() {
        try (Connection connection = dataSource.getConnection()) {
            String sql = "SELECT id, brand, food_type, name, good_until, quantity_on_stock " +
                "FROM cat_food WHERE quantity_on_stock > 0 AND good_until >= CURRENT_DATE";
            //    "FROM cat_food, dog_food, fish_food WHERE quantity_on_stock > 0";

            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            List<Food> foodList = new ArrayList<>();
            while (rs.next()) {
                long id = rs.getLong(1);
                Brand brand = Brand.valueOf(rs.getString(2));
                FoodType foodType = FoodType.valueOf(rs.getString(3));
                String name = rs.getString(4);
                Date date = rs.getDate(5);
                int quantityOnStock = rs.getInt(6);
                CatFood food = new CatFood(id, brand, foodType, name, date, quantityOnStock);
                foodList.add(food);
            }

            return foodList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Food> findAllFood() {
        try (Connection connection = dataSource.getConnection()) {
            String sql = "SELECT id, brand, food_type, name, good_until, quantity_on_stock FROM cat_food";

            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            List<Food> foodList = new ArrayList<>();
            while (rs.next()) {
                long id = rs.getLong(1);
                Brand brand = Brand.valueOf(rs.getString(2));
                FoodType foodType = FoodType.valueOf(rs.getString(3));
                String name = rs.getString(4);
                Date date = rs.getDate(5);
                int quantityOnStock = rs.getInt(6);
                CatFood food = new CatFood(id, brand, foodType, name, date, quantityOnStock);
                foodList.add(food);
            }

            return foodList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Food> findAllFoodByBrand(Brand brand) {
        try (Connection connection = dataSource.getConnection()) {
            String sql = "SELECT id, brand, food_type, name, good_until, quantity_on_stock " +
                "FROM cat_food WHERE brand = ?";

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, String.valueOf(brand));
            ResultSet rs = ps.executeQuery();

            List<Food> foodList = new ArrayList<>();
            while (rs.next()) {
                long id = rs.getLong(1);
                brand = Brand.valueOf(rs.getString(2));
                FoodType foodType = FoodType.valueOf(rs.getString(3));
                String name = rs.getString(4);
                Date date = rs.getDate(5);
                int quantityOnStock = rs.getInt(6);
                CatFood food = new CatFood(id, brand, foodType, name, date, quantityOnStock);
                foodList.add(food);
            }

            return foodList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
