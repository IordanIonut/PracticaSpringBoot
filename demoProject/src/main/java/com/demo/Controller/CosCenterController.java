package com.demo.Controller;

import com.demo.Model.CosCenter;
import com.demo.service.CosCenterSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200/"})
@RestController
@RequestMapping("/api/coscenter/")
public class CosCenterController {
    @Autowired
    private CosCenterSer cosCenterSer;

    @GetMapping(value = "/listar")
    public ResponseEntity<List<CosCenter>> listarCosCenter(){
        return new ResponseEntity<>(cosCenterSer.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/listar")
    public ResponseEntity<CosCenter> createCosCenter(@Valid  @RequestBody CosCenter center){
        return new ResponseEntity<>(cosCenterSer.save(center),HttpStatus.CREATED);
    }

    @PutMapping(value = "/actualizar/{id}")
    public ResponseEntity<CosCenter> actualizareCosCenter(@Valid @PathVariable Long id, @RequestBody CosCenter center){
        CosCenter cos = cosCenterSer.findById(id);
        if(cos == null){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        try{
            cos.setFlag(center.getFlag());
            cos.setName(center.getName());
            return new ResponseEntity<>(cosCenterSer.save(cos),HttpStatus.CREATED);
        }
        catch (DataAccessException e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable Long id){
        cosCenterSer.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}
