package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        DatabaseConnection databaseConnection
                = new DatabaseConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "1");
        CarDAO carDAO = new CarDAO(databaseConnection);

        Car car = new Car(100, "MINI", "ENGLAND");

        System.out.println(carDAO.getAllCars());
        carDAO.insertCar(car);

        carDAO.delCar(2);

        carDAO.updateCar(car);

    }
}