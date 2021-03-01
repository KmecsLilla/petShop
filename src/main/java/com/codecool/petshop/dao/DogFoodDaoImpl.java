package com.codecool.petshop.dao;

import com.codecool.petshop.model.*;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class DogFoodDaoImpl implements DogFoodDao {
    DataSource dataSource;

    public DogFoodDaoImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public Food findFoodById(long id) {
        try (Connection connection = dataSource.getConnection()) {
            String sql = "SELECT id, brand, food_type, name, good_until, quantity_on_stock FROM food WHERE id = ?";

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setLong(1,id);

            ResultSet rs = ps.executeQuery();
            if (!rs.next()) {
               return null;
            }
            DogFood dogFood = new DogFood(rs.getLong(1),
                Brand.valueOf(rs.getString(2)),
                FoodType.valueOf(rs.getString(3)),
                rs.getString(4),
                Date.valueOf(rs.getString(5)),
                rs.getInt(6));
            return dogFood;

        } catch (SQLException e) {
            throw  new RuntimeException("Error while reading file with id: " + id + ".",e);
        }
    }

    @Override
    public List<Food> findAllFoodOnStock() {
        try (Connection connection = dataSource.getConnection()) {
            String sql = "SELECT id, brand, food_type, name, good_until, quantity_on_stock " +
                "FROM dog_food WHERE quantity_on_stock > 0 AND good_until >= CURRENT_DATE";
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
                DogFood food = new DogFood(id, brand, foodType, name, date, quantityOnStock);
                foodList.add(food);
            }

            return foodList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Food> findAllFood() {
        try (Connection connection = dataSource.getConnection()) {
            String sql = "SELECT id, brand, food_type, name, good_until, quantity_on_stock FROM dog_food";

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
                DogFood food = new DogFood(id, brand, foodType, name, date, quantityOnStock);
                foodList.add(food);
            }

            return foodList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Food> findAllFoodByBrand(Brand brand) {
        try (Connection connection = dataSource.getConnection()) {
            String sql = "SELECT id, brand, food_type, name, good_until, quantity_on_stock " +
                "FROM dog_food WHERE brand = ?";

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
                DogFood food = new DogFood(id, brand, foodType, name, date, quantityOnStock);
                foodList.add(food);
            }

            return foodList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}