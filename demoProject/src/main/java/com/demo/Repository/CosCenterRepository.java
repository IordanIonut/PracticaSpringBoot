package com.demo.Repository;

import com.demo.Model.CosCenter;
import com.demo.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CosCenterRepository
        extends JpaRepository<CosCenter,Long> {
}
