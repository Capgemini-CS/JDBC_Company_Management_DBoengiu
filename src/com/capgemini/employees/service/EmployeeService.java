package com.capgemini.employees.service;

import com.capgemini.employees.entity.Employee;
import com.capgemini.employees.repository.EmployeeRepository;
import com.capgemini.products.entity.Product;
import com.capgemini.products.repository.ProductRepository;

import java.util.List;

public class EmployeeService {
    EmployeeRepository employeeRepository = new EmployeeRepository();

    public List<Employee> getAllEmployees() {
        return employeeRepository.readAllValues();
    }
}
