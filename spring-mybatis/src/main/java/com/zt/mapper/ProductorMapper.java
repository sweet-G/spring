package com.zt.mapper;

import com.zt.entity.Productor;
import com.zt.entity.ProductorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductorMapper {
    long countByExample(ProductorExample example);

    int deleteByExample(ProductorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Productor record);

    int insertSelective(Productor record);

    List<Productor> selectByExample(ProductorExample example);

    Productor selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Productor record, @Param("example") ProductorExample example);

    int updateByExample(@Param("record") Productor record, @Param("example") ProductorExample example);

    int updateByPrimaryKeySelective(Productor record);

    int updateByPrimaryKey(Productor record);
}