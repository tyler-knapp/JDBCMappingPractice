package com.example.JDBCMappingPractice.dao;

import com.example.JDBCMappingPractice.model.TShirt;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TShirtDao<T> {
    
    List<T> findAll();
    
    TShirt insertTShirt(TShirt tShirt);
}
