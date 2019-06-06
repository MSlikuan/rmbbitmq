package com.wn.mapper;

import com.wn.entity.Productinfo;
import com.wn.entity.ProductinfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ProductinfoMapper {
    long countByExample(ProductinfoExample example);

    int deleteByExample(ProductinfoExample example);

    int deleteByPrimaryKey(String produtcId);

    int insert(Productinfo record);

    int insertSelective(Productinfo record);

    List<Productinfo> selectByExample(ProductinfoExample example);

    Productinfo selectByPrimaryKey(String produtcId);

    int updateByExampleSelective(@Param("record") Productinfo record, @Param("example") ProductinfoExample example);

    int updateByExample(@Param("record") Productinfo record, @Param("example") ProductinfoExample example);

    int updateByPrimaryKeySelective(Productinfo record);

    int updateByPrimaryKey(Productinfo record);
}