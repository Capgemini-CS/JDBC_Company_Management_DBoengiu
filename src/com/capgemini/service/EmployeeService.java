package com.capgemini.service;

import com.capgemini.entity.Employee;
import com.capgemini.repository.EmployeeRepository;
import com.capgemini.repository.Repository;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {
//    Repository employeeRepository = new EmployeeRepository();
    Repository<Employee> employeeRepository;

    public EmployeeService(Repository<Employee> employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<EmployeeDTO> getAllEmployees() {

        return employeeRepository.readAllValues().
                stream().
                map(EmployeeMapper::fromEmployee).
                collect(Collectors.toList());
    }
}
