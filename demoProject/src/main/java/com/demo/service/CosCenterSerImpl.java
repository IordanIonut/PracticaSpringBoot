package com.demo.service;



import com.demo.Model.CosCenter;
import com.demo.Model.Employee;
import com.demo.Repository.CosCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class CosCenterSerImpl  implements CosCenterSer{
    @Autowired
    private CosCenterRepository cosCenterRepository;


    @Override
    public CosCenter save(CosCenter cosCenter) {
        return cosCenterRepository.save(cosCenter);

    }

    @Override
    public CosCenter findById(Long id) {
        return cosCenterRepository.findById(id).orElse(null);
    }

    @Override
    public List<CosCenter> findAll() {
        return cosCenterRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        cosCenterRepository.deleteById(id);

    }
}
