package com.example.employeeboot.controller;

import com.example.employeeboot.entity.Employee;
import com.example.employeeboot.repo.EmployeeRepository;
import com.example.employeeboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api/emp")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    // Get All Employees
    @GetMapping("/allEmployees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @PostMapping("/employee")
    public Employee createEmployee(@Valid @RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    // Get All Employees
    @GetMapping("/sortedEmployees")
    public List<Employee> getAllEmployeesWithSort(@RequestParam Integer pageNo,
                                          @RequestParam Integer pageSize, @RequestParam String sortBy){
        return employeeService.getAllEmployeesWithSort(pageNo, pageSize, sortBy);
    }
}
