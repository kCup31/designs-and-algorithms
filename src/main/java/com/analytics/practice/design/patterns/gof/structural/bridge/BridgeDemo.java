package com.analytics.practice.design.patterns.gof.structural.bridge;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BridgeDemo {

    public static void main(String[] args) {

        try {
            // JDBC is an API
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());

            String dburl = "jdbc:derby:memory:codejava/webdb;create=true";

            Connection connection = DriverManager.getConnection(dburl);

            Statement statement = connection.createStatement();

            statement.executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(20), City VARCHAR(20))");

            System.out.println("Table created");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
