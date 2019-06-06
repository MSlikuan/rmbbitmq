package com.wn.service;

import com.wn.entity.Productinfo;

import java.util.List;

public interface ProductInfoService {
    //查询所有数据
    List<Productinfo> selectPrdouct();

    //根据id查询一条数据
    Productinfo selectById(String id);

    //根据id删除一条数据
    void  deleteById(String id);

    //根据传过来的对象更新数据

    void  update(Productinfo productInfo);

    //新增对象
    void  insert(Productinfo productInfo);
}
