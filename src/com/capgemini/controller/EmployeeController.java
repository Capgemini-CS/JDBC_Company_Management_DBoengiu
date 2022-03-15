package com.capgemini.controller;

import com.capgemini.entity.Employee;
import com.capgemini.repository.EmployeeRepository;
import com.capgemini.repository.Repository;
import com.capgemini.service.EmployeeService;

public class EmployeeController {
    public static void main(String[] args) {
        Repository<Employee> repository = new EmployeeRepository();

        EmployeeService employeeService = new EmployeeService(repository);


        System.out.println(employeeService.getAllEmployees().size());
    }
}
