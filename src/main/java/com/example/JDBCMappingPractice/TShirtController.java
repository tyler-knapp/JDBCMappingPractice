package com.example.JDBCMappingPractice;

import com.example.JDBCMappingPractice.model.TShirt;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TShirtController {
    
    private static TShirtDao<TShirt> dao;
    
    @RequestMapping("/tshirts")
    public List<TShirt> getTShirt(){
        return dao.findAll();
    }
}
