package com.capgemini;

import com.capgemini.exceptions.ConnectionException;
import org.tinylog.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnectionManager implements ConnectionManager{
    String url = "jdbc:mysql://localhost:3306/classicmodels";
    String user = "root";
    String password = "darius123qaz";

    Connection connection;

    @Override
    public Connection getConnection() {
        try {
            this.connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            Logger.error(e.getMessage());
            throw new ConnectionException("Couldn't connect to database");
        }
        return this.connection;
    }
}
