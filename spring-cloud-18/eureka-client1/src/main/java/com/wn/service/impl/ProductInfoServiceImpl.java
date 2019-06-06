package com.wn.service.impl;


import com.wn.entity.Productinfo;
import com.wn.mapper.ProductinfoMapper;
import com.wn.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductInfoServiceImpl implements ProductInfoService {

    @Autowired
    private ProductinfoMapper productInfoMapper;
    @Override
    public List<Productinfo> selectPrdouct() {

        return productInfoMapper.selectByExample(null);
    }

    @Override
    public Productinfo selectById(String id) {
        return productInfoMapper.selectByPrimaryKey(id);


    }

    @Override
    public void deleteById(String id) {
        productInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Productinfo productInfo) {

         if(productInfo!=null){
             System.out.println(productInfo);
             productInfoMapper.updateByPrimaryKeySelective(productInfo);
         }
    }

    @Override
    public void insert(Productinfo productInfo) {
        if(productInfo!=null){
            productInfoMapper.insert(productInfo);
        }
    }
}
