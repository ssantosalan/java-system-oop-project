package com.example.fxproject;

import java.sql.Connection;
import java.sql.DriverManager;

public class ExampleDatabaseConnection {
    public Connection databaseLink;

    public Connection getConnection() {
        String databaseName = "projetointegrador_terceiro";
        String databaseUser = "root";
        String databasePassword = "";
        String url = "jdbc:mysql://localhost/" + databaseName;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url, databaseUser, databasePassword);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return databaseLink;
    }
}
