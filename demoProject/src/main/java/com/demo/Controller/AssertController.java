package com.demo.Controller;

import com.demo.Model.Assert;
import com.demo.service.AssertSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200/"})
@RestController
@RequestMapping("/api/assert/")
public class AssertController {
    @Autowired
    private AssertSer asse;

    @GetMapping(value = "/listar")
    public ResponseEntity<List<Assert>> listarAssert(){
        return new ResponseEntity<>(asse.findAll(), HttpStatus.OK);
    }


    @PostMapping(value = "/listar")
    public ResponseEntity<Assert> createAssert(@Valid @RequestBody Assert ass){
        return new ResponseEntity<>(asse.save(ass),HttpStatus.CREATED);
    }

    @PutMapping(value = "/actualizar/{id}")
    public ResponseEntity<Assert> actualizareAssert(@Valid@PathVariable Long id,
                                                    @RequestBody Assert ass){
        Assert anAssert = asse.findById(id);
        if(anAssert == null){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        try{
            anAssert.setName(ass.getName());
            anAssert.setDescription(ass.getDescription());
            anAssert.setCoscenter(ass.getCoscenter());
            anAssert.setDate_Input(ass.getDate_Input());

            return new ResponseEntity<>(asse.save(anAssert),HttpStatus.CREATED);
        }
        catch (DataAccessException e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<?> deleteAssert(@Valid @PathVariable Long id){
        asse.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
