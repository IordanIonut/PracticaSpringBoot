package com.demo.service;

import com.demo.Model.Employee;
import com.demo.Model.Manager;
import com.demo.Repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ManagerSerImpl implements ManagerSer{
    @Autowired
    private ManagerRepository managerRepository;
    @Override
    public List<Manager> findAll() {
        return managerRepository.findAll();
    }

}
