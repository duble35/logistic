package com.app.dao;

import java.sql.*;

public class ConnectionDB {

    //Variables;
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/logistic";
    private static final String USER = "sa";
    private static final String PASS = "2468";

    private static Connection conn = null;

    public Connection getDB() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USER, PASS);

        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Erro!: " + e.getMessage());
        }

        if (conn == null) {
            System.out.println("A conexão está vazia.");
        }

        return conn;

    }

    public static void main(String[] args) {
        new ConnectionDB().getDB();
    }

}
