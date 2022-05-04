package com.example.fxproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Controller {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("WELCOME, DEVELOPER! IT'S A NEW ERA!");
    }

    @FXML
    private Label showUsernameLabel;

    public void connectButton(ActionEvent event) {
        MyDatabaseConnection connectNow = new MyDatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String connectQuery = "select nome from cliente";

        try {
            Statement statement = connectDB.createStatement();
            ResultSet queryOutput = statement.executeQuery(connectQuery);

            while (queryOutput.next()) {
                showUsernameLabel.setText(queryOutput.getString("nome"));
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}