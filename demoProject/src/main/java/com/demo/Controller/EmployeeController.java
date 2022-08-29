package com.demo.Controller;


import com.demo.Model.Employee;
import com.demo.Model.Manager;
import com.demo.service.EmployeeSer;
import com.demo.service.ManagerSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    /*@GetMapping("/employee")
    public ResponseEntity<List<Employee>> getAllTutorials(@RequestParam(required = false) String title) {
        try {
            List<Employee> employees = new ArrayList<Employee>();
            if (employees.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(employees, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/employee")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        try {
            Employee _employe = employeeRepository
                    .save(new Employee(employee.getName(), employee.getCos_Center(),
                            employee.getManager(), employee.getNr_Of_Phone(), employee.getPassword(),
                            employee.getEmail(), employee.getPassword(), employee.getCode(),false));
            return new ResponseEntity<>(_employe, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }*/

    @GetMapping(value = "/listar")
    public ResponseEntity<List<Employee>> listarEmployee(){
        return new ResponseEntity<>(employeeRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/managers")
    public ResponseEntity<List<Manager>> listarManager(){
        return new ResponseEntity<>(managerSer.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/listar")
    public ResponseEntity<Employee> createEmployee(@Valid @RequestBody Employee employee){
        return new ResponseEntity<>(employeeRepository.save(employee),HttpStatus.CREATED);
     }

     @PutMapping(value = "/actualizar/{id}")
     public ResponseEntity<Employee> actualizareEmployee(@PathVariable Long id, @RequestBody Employee employee){
        Employee emp = employeeRepository.findById(id);
        if(emp == null){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        try{
            emp.setName(employee.getName());
            emp.setCos_Center(employee.getCos_Center());
            emp.setManager(employee.getManager());
            emp.setNr_Of_Phone(emp.getNr_Of_Phone());
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
     public ResponseEntity<?> deleteEmployee(@PathVariable Long id){
        employeeRepository.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
     }

    /*@PostMapping("/employee")
    public  Employee createEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }*/
}
