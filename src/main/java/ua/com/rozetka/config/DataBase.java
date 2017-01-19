package ua.com.rozetka.config;

import ua.com.rozetka.helpers.LoadProperties;

import java.sql.*;

public class DataBase {

    public DataBase(){
        // Register JDBC driver
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static final String URL = LoadProperties.getProperty("url");
    private static final String USER = LoadProperties.getProperty("user");
    private static final String PASSWORD = LoadProperties.getProperty("password");

    protected static Connection connection;
    protected static PreparedStatement statement;

    public static void connectToDB(){
        try{

            connection = DriverManager.getConnection(URL, USER, PASSWORD);

        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void disconnectDB(){
        if(statement!=null) try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
