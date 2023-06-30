package com.example.proj4db;

import com.example.proj4db.model.Employee;
import com.example.proj4db.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    @Bean // Спринг сам должен создать объект LoadDatabase
    CommandLineRunner initDatabase(EmployeeRepository repository) {
        return args -> {
            repository.save(new Employee("human1", "role1"));
            repository.save(new Employee("human2", "role2"));
        };
    }
}