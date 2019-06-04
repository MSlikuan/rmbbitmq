package com.wn.util;

import org.apache.commons.lang3.SerializationUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
@Component
public class RedisUtil<T> {
    @Autowired
    private  static  RedisTemplate redisTemplate;

    public static <T extends Serializable> void  set(String key, List<T> list){
        for (T product:list) {
            System.out.println(product);
            redisTemplate.opsForList().leftPush(key.getBytes(),SerializationUtils.serialize(product));
        }
    }

    public static <T extends Serializable> List<T> get(String key){
         ArrayList<T>  list=new ArrayList<T>();
         List<byte[]> range=redisTemplate.opsForList().range(key.getBytes(),0,-1);
        for(byte[] b:range){
            T  product=SerializationUtils.deserialize(b);
            list.add(product);
        }
        return list;
    }
}
