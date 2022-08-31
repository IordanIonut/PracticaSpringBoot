package com.demo.service;

import com.demo.Model.CosCenter;
import com.demo.Model.Employee;

import java.util.List;

public interface CosCenterSer {
    public CosCenter save(CosCenter cosCenter);
    public CosCenter findById(Long id);
    public List<CosCenter> findAll();
    public void delete(Long id);

}
