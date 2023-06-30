package com.example.proj4db.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.proj4db.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
