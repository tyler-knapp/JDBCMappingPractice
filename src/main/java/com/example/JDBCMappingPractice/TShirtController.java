package com.example.JDBCMappingPractice;

import com.example.JDBCMappingPractice.model.TShirt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
