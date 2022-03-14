package com.capgemini.employees.repository;

import com.capgemini.MySQLConnectionManager;
import com.capgemini.Repository;
import com.capgemini.employees.entity.Employee;
import com.capgemini.exceptions.ConnectionException;
import com.capgemini.exceptions.ReadFromTableException;
import org.tinylog.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements Repository<com.capgemini.employees.entity.Employee> {

    MySQLConnectionManager manager = new MySQLConnectionManager();

    @Override
    public List<com.capgemini.employees.entity.Employee> readAllValues() {
        String selectAllFromTable = "SELECT * FROM employees";
        List<Employee> employees = new ArrayList<>();

        try (Connection connection = manager.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(selectAllFromTable)){

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                employees.add(
                    new Employee(
                            resultSet.getInt("employeeNumber"),
                            resultSet.getString("lastName"),
                            resultSet.getString("firstName"),
                            resultSet.getString("extension"),
                            resultSet.getString("extension"),
                            resultSet.getString("officeCode"),
                            resultSet.getInt("reportsTo"),
                            resultSet.getString("jobTitle")
                            )
                );
            }
        } catch (SQLException e) {
            Logger.error(e.getMessage());
            throw new ReadFromTableException("Couldn't read data from table");
        }


        return employees;

    }
}
