package com.example.JDBCMappingPractice.dao;

import com.example.JDBCMappingPractice.model.TShirt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TShirtJdbcDao implements TShirtDao<TShirt> {
    
    private static final Logger logger = LoggerFactory.getLogger(TShirtJdbcDao.class);
    private final JdbcTemplate jdbcTemplate;
    
    public TShirtJdbcDao(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    
    RowMapper<TShirt> rowMapper = (rs, rowNum) -> {
        TShirt tShirt = new TShirt();
        tShirt.setId(rs.getLong("id"));
        tShirt.setPrice(rs.getDouble("price"));
        tShirt.setColor(rs.getString("color"));
        tShirt.setDescription(rs.getString("description"));
        tShirt.setSize(rs.getString("size"));
        tShirt.setOnSale(rs.getBoolean("is_on_sale"));
        tShirt.setSoldOut(rs.getBoolean("is_sold_out"));
        return tShirt;
    };
    
    @Override
    public List<TShirt> findAll() {
        String sql = "SELECT id, price, color, description, size, is_on_sale, is_sold_out FROM tshirts";
        return jdbcTemplate.query(sql, rowMapper);
    }
    
    //TODO: THIS NEEDS WORK
    @Override
    public TShirt insertTShirt(TShirt tShirt) {
        String sql = " INSERT INTO tshirts (id, price, color, description, size, is_on_sale, is_sold_out) VALUES(default, ? , ? , ? , ? , ? , ?)";
        jdbcTemplate.execute(sql);
        return null;
    }
}
