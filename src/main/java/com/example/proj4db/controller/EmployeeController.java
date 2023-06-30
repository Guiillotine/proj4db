package com.example.proj4db.controller;

import com.example.proj4db.model.Employee;
import com.example.proj4db.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeRepository employeeRepository;
    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    @GetMapping(value = "/all")
    public ResponseEntity getAll() {
        List<Employee> employees = employeeRepository.findAll();
        employeeRepository.save(new Employee("human555", "role55"));
        log.warn("Список сотрудников {}", employees);
        return ResponseEntity.ok(employees);
        //return ResponseEntity.ok(this.employeeRepository.findAll());
    }
}