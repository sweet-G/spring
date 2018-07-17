package com.zt.dao;

import com.zt.entity.Productor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SingleColumnRowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author zhangtian
 * @date 2018/7/17
 */
@Repository
public class ProductorDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(Productor productor){
        String sql = "insert into productor (pro_name,pro_num) values (?,?)";
        jdbcTemplate.update(sql,productor.getProName(),productor.getProNum());
    }

    public Productor findById(Integer id){
        String sql = "select id, pro_name, pro_num from productor where id = ?";
        return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(Productor.class),id);
    }

    public List<Productor> findAll(){
        String sql = "select * from productor";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Productor.class));
    }

    public int count(){
        String sql ="select count(*) from productor";
        return jdbcTemplate.queryForObject(sql, new SingleColumnRowMapper<Long>()).intValue();
    }

    public List<Map<String, Object>> findMapList(){
        String sql ="select * from productor";
        return jdbcTemplate.query(sql, new ColumnMapRowMapper());
    }
}
