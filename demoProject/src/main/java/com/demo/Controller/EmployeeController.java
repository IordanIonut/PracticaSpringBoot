package com.demo.Controller;


import com.demo.Model.CosCenter;
import com.demo.Model.Employee;
import com.demo.Model.Manager;
import com.demo.service.CosCenterSer;
import com.demo.service.EmployeeSer;
import com.demo.service.ManagerSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200/"})
@RestController
@RequestMapping("/api/employee/")
public class EmployeeController {
    @Autowired
    private EmployeeSer employeeRepository;
    @Autowired
    private ManagerSer managerSer;
    @Transactional
    @GetMapping(value = "/listar")
    public ResponseEntity<List<Employee>> listarEmployee(){
        return new ResponseEntity<>(employeeRepository.findAll(), HttpStatus.OK);
    }
    @Transactional
    @GetMapping(value = "/managers")
    public ResponseEntity<List<Manager>> listarManager(){
        return new ResponseEntity<>(managerSer.findAll(), HttpStatus.OK);
    }
    @Transactional
    @PostMapping(value = "/listar")
    public ResponseEntity<Employee> createEmployee( @RequestBody Employee employee){
        return new ResponseEntity<>(employeeRepository.save(employee),HttpStatus.CREATED);
     }

     @PutMapping(value = "/actualizar/{id}")
     public ResponseEntity<Employee> actualizareEmployee(@Valid @PathVariable Long id, @RequestBody Employee employee){
        Employee emp = employeeRepository.findById(id);
        if(emp == null){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        try{
            emp.setName(employee.getName());
            emp.setCos_Center(employee.getCos_Center());
            emp.setManager(employee.getManager());
            emp.setNr_Of_Phone(employee.getNr_Of_Phone());
            emp.setPassword(employee.getPassword());
            emp.setEmail(employee.getEmail());
            emp.setCode(employee.getCode());
            return new ResponseEntity<>(employeeRepository.save(emp),HttpStatus.CREATED);
        }
        catch (DataAccessException e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
     }

     @DeleteMapping(value = "/delete/{id}")
     public ResponseEntity<?> deleteEmployee(@Valid @PathVariable Long id){
        employeeRepository.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
     }

    /*@PostMapping("/employee")
    public  Employee createEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }*/
}
