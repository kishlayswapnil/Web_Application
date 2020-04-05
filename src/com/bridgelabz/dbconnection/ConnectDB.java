package com.bridgelabz.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectDB {

    //This method has been used to load the JDBC Driver.
    public void loadDriver(String dbDriver) {
        try {
            Class.forName(dbDriver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //This method has been used to establish the connection from the DB.
    public Connection connect() {
        final String url = "jdbc:postgresql://localhost/";
        final String user = "postgres";
        final String password = "password";

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        //Returning the value of connection.
        return conn;
    }

    //The method that will enter the user data in database.
    public String insert(UserInfo userInfo) {

        //Link of driver from where it will be downloaded.
        String dbDriver = "org.postgresql.Driver";
        loadDriver(dbDriver);

        //Check the value of connection.
        Connection connector = connect();
        String result = "Data Stored Successfully.";

        //Inserting the sql query for the DB.
        String sql = "insert into userInfo values(?,?,?,?,?)";
        try {
            PreparedStatement prepStatement = connector.prepareStatement(sql);

            //Setting the values of each and every parameter.
            prepStatement.setString(1, userInfo.getFirstName());
            prepStatement.setString(2, userInfo.getLastName());
            prepStatement.setString(3, userInfo.getEmailID());
            prepStatement.setString(4, userInfo.getContact());
            prepStatement.setString(5, userInfo.getPswd());

        } catch (SQLException e) {
            e.printStackTrace();
            result = "Data Not Stored.";
        }
        return result;

    }

    public static void main(String[] args) {
        ConnectDB app = new ConnectDB();
        app.connect();
    }
}
