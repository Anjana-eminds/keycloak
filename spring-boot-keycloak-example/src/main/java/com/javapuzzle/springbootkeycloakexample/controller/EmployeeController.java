package com.javapuzzle.springbootkeycloakexample.controller;

import com.javapuzzle.springbootkeycloakexample.model.Employee;
import com.javapuzzle.springbootkeycloakexample.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @PostMapping("/admin/employee")
    public Object saveEmployee(Employee employee){
        return ResponseEntity.ok(employeeRepository.save(employee));
    }

    @GetMapping("/user/employee")
    public Object getEmployee(){
        return ResponseEntity.ok(employeeRepository.findAll());
    }
}
