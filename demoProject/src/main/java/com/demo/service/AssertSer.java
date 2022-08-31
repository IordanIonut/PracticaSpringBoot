package com.demo.service;

import com.demo.Model.Assert;
import com.demo.Model.CosCenter;

import java.util.List;

public interface AssertSer {
    public Assert save(Assert asert);
    public Assert findById(Long id);
    public List<Assert> findAll();
    public void delete(Long id);
}
