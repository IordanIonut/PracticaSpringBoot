package com.demo.service;

import com.demo.Model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
public interface EmployeeSer {
    public Employee save(Employee employee);
    public Employee findById(Long id);
    public List<Employee> findAll();
    public void delete(Long id);
}
