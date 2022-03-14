package com.capgemini.service;

import com.capgemini.entity.Employee;
import com.capgemini.repository.EmployeeRepository;

import java.util.List;

public class EmployeeService {
    EmployeeRepository employeeRepository = new EmployeeRepository();

    public List<Employee> getAllEmployees() {
        return employeeRepository.readAllValues();
    }
}
