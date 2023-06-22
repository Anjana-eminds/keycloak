package com.javapuzzle.springbootkeycloakexample.repository;

import com.javapuzzle.springbootkeycloakexample.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
