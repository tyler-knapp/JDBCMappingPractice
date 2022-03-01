package com.example.JDBCMappingPractice;

import java.util.List;

public interface TShirtDao<T> {
    
    List<T> findAll();
}
