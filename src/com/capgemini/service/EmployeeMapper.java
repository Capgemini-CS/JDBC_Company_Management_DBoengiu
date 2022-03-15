package com.capgemini.service;

import com.capgemini.entity.Employee;

public class EmployeeMapper {

    public static Employee fromDTO(EmployeeDTO employeeDTO){
        Employee employee = new Employee();

        employee.setEmployeeNumber(employeeDTO.getEmployeeNumber());
        employee.setLastName(employeeDTO.getLastName());
        employee.setFirstName(employeeDTO.getFirstName());
        employee.setExtension(employeeDTO.getExtension());
        employee.setEmail(employeeDTO.getEmail());
        employee.setOfficeCode(employeeDTO.getOfficeCode());
        employee.setReportsTo(employeeDTO.getReportsTo());
        employee.setJobTitle(employeeDTO.getJobTitle());

        return employee;
    }

    public static EmployeeDTO fromEmployee(Employee employee) {
        EmployeeDTO employeeDTO = new EmployeeDTO();

        employeeDTO.setEmployeeNumber(employee.getEmployeeNumber());
        employeeDTO.setLastName(employee.getLastName());
        employeeDTO.setFirstName(employee.getFirstName());
        employeeDTO.setExtension(employee.getExtension());
        employeeDTO.setEmail(employee.getEmail());
        employeeDTO.setOfficeCode(employee.getOfficeCode());
        employeeDTO.setReportsTo(employee.getReportsTo());
        employeeDTO.setJobTitle(employee.getJobTitle());

        return employeeDTO;

    }
}
