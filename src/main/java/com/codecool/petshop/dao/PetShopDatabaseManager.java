package com.codecool.petshop.dao;

import org.postgresql.ds.PGSimpleDataSource;

import javax.sql.DataSource;

public class PetShopDatabaseManager {
    public static DataSource connect() {
        PGSimpleDataSource dataSource = new PGSimpleDataSource();
        dataSource.setDatabaseName("petshop_db");
        dataSource.setUser("kislill");
        dataSource.setPassword("Kislill");
        return dataSource;
    }
}
