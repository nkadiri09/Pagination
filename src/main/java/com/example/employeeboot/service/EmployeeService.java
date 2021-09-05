package com.example.employeeboot.service;

import com.example.employeeboot.entity.Employee;
import com.example.employeeboot.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository repository;

    public List<Employee> getAllEmployees()
    {
        return repository.findAll();
    }

    public Employee createEmployee(Employee employee){
        return repository.save(employee);
    }

    public List<Employee> getAllEmployeesWithSort(Integer pageNo, Integer pageSize, String sortBy)
    {
        // For multiple key sorting Sort.by(sortby).and(Sort.by("<Field-Name>"))
        Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));

        Page<Employee> pagedResult = repository.findAll(paging);

        if(pagedResult.hasContent()) {
            return pagedResult.getContent();
        } else {
            return new ArrayList<Employee>();
        }
    }


}
