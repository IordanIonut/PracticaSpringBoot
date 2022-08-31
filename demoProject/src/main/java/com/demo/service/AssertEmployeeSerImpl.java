package com.demo.service;

import com.demo.Model.Asser_Employee;
import com.demo.Repository.AssertEmployeeRepository;
import com.demo.Repository.AssertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class AssertEmployeeSerImpl implements AssertEmployeeSer{
    @Autowired
    private AssertEmployeeRepository assertEmployeeRepository;

    @Override
    public Asser_Employee save(Asser_Employee asser_employee) {
        return assertEmployeeRepository.save(asser_employee);
    }

    @Override
    public Asser_Employee findById(Long id) {
        return assertEmployeeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Asser_Employee> findAll() {
        return assertEmployeeRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        assertEmployeeRepository.deleteById(id);

    }
}
