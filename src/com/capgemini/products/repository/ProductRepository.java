package com.capgemini.products.repository;

import com.capgemini.MySQLConnectionManager;
import com.capgemini.Repository;
import com.capgemini.exceptions.ConnectionException;
import com.capgemini.products.entity.Product;
import org.tinylog.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements Repository<Product> {

    MySQLConnectionManager manager = new MySQLConnectionManager();


    @Override
    public List<Product> readAllValues() {
        String selectAllFromTable = "SELECT * FROM products";
        List<Product> products = new ArrayList<>();

        try (Connection connection = manager.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(selectAllFromTable)){

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                products.add(
                        new Product(
                                resultSet.getString("productCode"),
                                resultSet.getString("productName"),
                                resultSet.getString("productLine"),
                                resultSet.getString("productScale"),
                                resultSet.getString("productVendor"),
                                resultSet.getString("productDescription"),
                                resultSet.getInt("quantityInStock"),
                                resultSet.getDouble("buyPrice"),
                                resultSet.getDouble("MSRP")
                                )
                );
            }
        } catch (SQLException e) {
            Logger.error(e.getMessage());
            throw new ConnectionException("Couldn't read data from table");
        }


        return products;
    }

    public Product readValuesByProductCode(String productCode) {
        String selectFromTable = "SELECT * FROM products WHERE productCode = ?";
        Product searchedProduct = null;

        try (Connection connection = manager.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(selectFromTable)){

            preparedStatement.setString(1, productCode);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                searchedProduct =
                        new Product(
                                resultSet.getString("productCode"),
                                resultSet.getString("productName"),
                                resultSet.getString("productLine"),
                                resultSet.getString("productScale"),
                                resultSet.getString("productVendor"),
                                resultSet.getString("productDescription"),
                                resultSet.getInt("quantityInStock"),
                                resultSet.getDouble("buyPrice"),
                                resultSet.getDouble("MSRP")
                        );

            }

        } catch (SQLException e) {
            Logger.error(e.getMessage());
            throw new ConnectionException("Couldn't read data from table");
        }

        return searchedProduct;
    }


}
