package com.zt.service;

import com.zt.dao.UserDao;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author zhangtian
 * @date 2018/7/14
 */

public class BaseService {
    private Integer id;
    private String name;
    private Double score;
    private List<String> stringList;
    private Set<Integer> numSet;
    private Map<String,String> maps;
    private Properties properties;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public void setNumSet(Set<Integer> numSet) {
        this.numSet = numSet;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getScore() {
        return score;
    }

    public List<String> getStringList() {
        return stringList;
    }

    public Set<Integer> getNumSet() {
        return numSet;
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public Properties getProperties() {
        return properties;
    }
}
