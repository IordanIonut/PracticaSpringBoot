package com.demo.service;

import com.demo.Model.Assert;
import com.demo.Repository.AssertRepository;
import com.demo.Repository.CosCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class AssertSerImpl implements AssertSer {
    @Autowired
    private AssertRepository assertRepository;
    @Override
    public Assert save(Assert asert) {
        return assertRepository.save(asert);
    }

    @Override
    public Assert findById(Long id) {
        return assertRepository.findById(id).orElse(null);
    }

    @Override
    public List<Assert> findAll() {
        return assertRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        assertRepository.deleteById(id);

    }
}
