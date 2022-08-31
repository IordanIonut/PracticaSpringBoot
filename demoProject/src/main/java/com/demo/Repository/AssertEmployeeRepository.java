package com.demo.Repository;

import com.demo.Model.Asser_Employee;
import com.demo.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssertEmployeeRepository extends JpaRepository<Asser_Employee,Long> {
}
