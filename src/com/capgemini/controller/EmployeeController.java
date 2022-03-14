package com.capgemini.controller;

import com.capgemini.service.EmployeeService;

public class EmployeeController {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();


        System.out.println(employeeService.getAllEmployees().size());
    }
}
