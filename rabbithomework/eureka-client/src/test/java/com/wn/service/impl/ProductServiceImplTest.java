package com.wn.service.impl;

import com.wn.entity.ProductInfo;
import com.wn.service.ProductService;
import com.wn.util.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.SerializationUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class ProductServiceImplTest {
    @Autowired
    private ProductService productService;
    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    public void run(){
        List<ProductInfo> list = productService.list();
        log.info("得到商品对象={}",list);
        RedisUtil.set("aa",list);

        List<Serializable> aa = RedisUtil.get("aa");
        log.info("得到rides对象={}",aa);

      /*  List<ProductInfo> list=null;
        //判断redis缓存是否为空
        if(redisTemplate.opsForList().size("products".getBytes())!=0){
            System.out.println("==========================使用缓存");
            //如果不为空就使用把缓存字节数组集合数据反序列化到list集合中
            list=new ArrayList<ProductInfo>();
            List<byte[]> range = redisTemplate.opsForList().range("products".getBytes(), 0, -1);
            for(byte[] b:range){
                ProductInfo product=SerializationUtils.deserialize(b);
                list.add(product);
            }
        }else{
            System.out.println("=======================使用业务查询");
            //如果为空就使用业务插叙功能，并把业务查询的到的对象序列化到redis缓存
            list =  productService.list();
            for(ProductInfo product:list){
                redisTemplate.opsForList().leftPush("products".getBytes(),SerializationUtils.serialize(product));
            }
            log.info("得到商品对象={}",list);
        }*/


    }
}