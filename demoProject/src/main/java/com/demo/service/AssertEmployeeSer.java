package com.demo.service;

import com.demo.Model.Asser_Employee;
import com.demo.Model.Assert;

import java.util.List;

public interface AssertEmployeeSer {
    public Asser_Employee save(Asser_Employee asser_employee);
    public Asser_Employee findById(Long id);
    public List<Asser_Employee> findAll();
    public void delete(Long id);
}
