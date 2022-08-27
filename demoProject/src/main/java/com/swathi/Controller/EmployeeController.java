package com.swathi.Controller;


import com.swathi.Model.Employee;
import com.swathi.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employee")
    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }

    @PostMapping("/employee")
    public  Employee createEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }
}
