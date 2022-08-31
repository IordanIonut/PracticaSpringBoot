package com.demo.Repository;

import com.demo.Model.Assert;
import com.demo.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssertRepository extends JpaRepository<Assert,Long> {
}
