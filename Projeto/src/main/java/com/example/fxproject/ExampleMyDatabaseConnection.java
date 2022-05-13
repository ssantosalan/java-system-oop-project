package com.example.fxproject;

import java.sql.*;

public class ExampleMyDatabaseConnection {
    public Connection con;
    public Statement st;
    public ResultSet resultado = null;
    public ResultSet resultado2 = null;
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public Connection databaseLink;

    public Connection getConnection() {
        String databaseName = "projetointegrador_terceiro";
        String databaseUser = "root";
        String databasePassword = "";
        String url = "jdbc:mysql://localhost/" + databaseName;

        this.setLocationRelativeTo(null);

        try {
            conexao = DriverManager.getConnection(url, databaseUser, databasePassword);
            st = (Statement) conexao.createStatement();
            con = DriverManager.getConnection(url, databaseUser, databasePassword);
            st = (Statement) con.createStatement();
//            JOptionPane.showMessageDialog(null, "Conectado!");
            System.out.println("CONECTOU");
        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Não Conectado!");
            System.out.println("NÂO CONECTOU");

        }

        return con;


//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            databaseLink = DriverManager.getConnection(url, databaseUser, databasePassword);
//            st = (Statement) databaseLink.createStatement();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return databaseLink;
    }

    public Statement getStatement() {
        return st;
    }

    private void setLocationRelativeTo(Object o) {
    }
}


//public class MyDatabaseConnection {
//    public Connection databaseLink;
//    public Statement st;
//
//    public Connection getConnection() {
//        String databaseName = "projetointegrador_terceiro";
//        String databaseUser = "root";
//        String databasePassword = "";
//        String url = "jdbc:mysql://localhost/" + databaseName;
//
//
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            databaseLink = DriverManager.getConnection(url, databaseUser, databasePassword);
//            st = (Statement) databaseLink.createStatement();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return databaseLink;
//    }
//}
