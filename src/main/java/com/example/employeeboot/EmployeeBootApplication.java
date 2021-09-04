package com.example.employeeboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class EmployeeBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeBootApplication.class, args);
    }

}
