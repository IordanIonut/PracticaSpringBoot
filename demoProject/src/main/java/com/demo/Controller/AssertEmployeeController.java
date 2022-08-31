package com.demo.Controller;

import com.demo.Model.Asser_Employee;
import com.demo.service.AssertEmployeeSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
@CrossOrigin(origins = {"http://localhost:4200/"})
@RestController
@RequestMapping("/api/assertemployee/")
public class AssertEmployeeController {
    @Autowired
    private AssertEmployeeSer assertEmployeeSer;

    @GetMapping(value = "/listar")
    public ResponseEntity<List<Asser_Employee>> listarAssertEmployee(){
        return new ResponseEntity<>(assertEmployeeSer.findAll(), HttpStatus.OK);
    }


    @PostMapping(value = "/listar")
    public ResponseEntity<Asser_Employee> createAssertEmployee(@Valid @RequestBody Asser_Employee asser_employee){
        return new ResponseEntity<>(assertEmployeeSer.save(asser_employee),HttpStatus.CREATED);
    }

    @PutMapping(value = "/actualizar/{id}")
    public ResponseEntity<Asser_Employee> actualizareAssertEmployee(@Valid @PathVariable Long id, @RequestBody Asser_Employee asser_employee){
        Asser_Employee asserEmployee = assertEmployeeSer.findById(id);
        if(asserEmployee == null){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        try{
            asserEmployee.setEmployee(asser_employee.getEmployee());
            asserEmployee.setCosCenter(asser_employee.getCosCenter());
            asserEmployee.setFrom(asser_employee.getFrom());
            asserEmployee.setTo(asserEmployee.getTo());
            asserEmployee.setEnd_To_Life(asser_employee.getEnd_To_Life());
            return new ResponseEntity<>(assertEmployeeSer.save(asserEmployee),HttpStatus.CREATED);
        }
        catch (DataAccessException e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<?> deleteAssertEmployee(@Valid @PathVariable Long id){
        assertEmployeeSer.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
