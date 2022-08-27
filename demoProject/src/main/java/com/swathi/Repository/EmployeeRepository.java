package com.swathi.Repository;

import com.swathi.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import
        org.springframework.web.HttpRequestMethodNotSupportedException;
@Repository
public interface EmployeeRepository  extends JpaRepository<Employee,Long> {
}
