package com.example.JDBCMappingPractice.controller;

import com.example.JDBCMappingPractice.dao.TShirtDao;
import com.example.JDBCMappingPractice.model.TShirt;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.rmi.ServerException;
import java.util.List;

@RestController
public class TShirtController {
    
    private final TShirtDao<TShirt> tShirtDao;
    
    public TShirtController(TShirtDao<TShirt> tShirtDao){
        this.tShirtDao = tShirtDao;
    }
    
    @GetMapping("/tshirts")
    public List<TShirt> getTShirt(){
        return tShirtDao.findAll();
    }
    
    //TODO: POST, UPDATE, DELETE
    
    @PostMapping("/tshirts")
    public ResponseEntity<TShirt> createTShirt(@RequestBody TShirt newTShirt){
        TShirt tShirt = tShirtDao.insertTShirt(newTShirt);
        if(tShirt == null){
            throw new NullPointerException();
        } else {
            return new ResponseEntity<>(tShirt, HttpStatus.CREATED);
        }
        
    }
    
}
