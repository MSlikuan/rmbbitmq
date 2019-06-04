package com.wn.controller;

import com.wn.entity.ProductInfo;
import com.wn.service.ProductService;
import com.wn.util.RedisUtil;
import com.wn.util.ResultUtil;
import com.wn.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.SerializationUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
public class ProductInfoController {

    @Autowired
    private ProductService productService;
    @Autowired
    private RedisTemplate redisTemplate;

    //查询商品信息
    @GetMapping("/products")
    public ResultVO lit(){
        List<ProductInfo> list=null;
        //判断redis缓存是否为空
      /*  if(redisTemplate.opsForList().size("products".getBytes())!=0){
            log.info("==========================使用缓存");
            //如果不为空就使用把缓存字节数组集合数据反序列化到list集合中
            List<Serializable> products = RedisUtil.get("products");
            return ResultUtil.success(products);
        }else{
            log.info("=======================使用业务查询");
            //如果为空就使用业务插叙功能，并把业务查询的到的对象序列化到redis缓存
             list = productService.list();
             log.info("查询到的集合为：={}",list);
             RedisUtil.set("products",list);
            //将查询到的集合添加到redis中
             return ResultUtil.success(list);
        }*/
      //  return ResultUtil.success(productService.list());

        if(redisTemplate.opsForList().size("products".getBytes())!=0){
            log.info("==========================使用缓存");
            //如果不为空就使用把缓存字节数组集合数据反序列化到list集合中
            list=new ArrayList<ProductInfo>();
            List<byte[]> range = redisTemplate.opsForList().range("products".getBytes(), 0, -1);
            for(byte[] b:range){
                ProductInfo product=SerializationUtils.deserialize(b);
                list.add(product);
            }
        }else{
            log.info("=======================使用业务查询");
            //如果为空就使用业务插叙功能，并把业务查询的到的对象序列化到redis缓存
            list =  productService.list();
            for(ProductInfo product:list){
                redisTemplate.opsForList().leftPush("products".getBytes(),SerializationUtils.serialize(product));
            }
            log.info("得到商品对象={}",list);
        }
        return ResultUtil.success(list);
    }


    @GetMapping("/products/{id}")
    public  ResultVO selectid(@PathVariable Integer id){
        ProductInfo productinfo=productService.selectById(id);
        if(productinfo!=null){
            return ResultUtil.success(productinfo);
        }
        return ResultUtil.error();
    }

    @DeleteMapping("/products/{id}")
    public ResultVO deleteid(@PathVariable Integer id){
        System.out.println(id);
        ProductInfo productinfo=productService.selectById(id);
        if(productinfo!=null){
            productService.delete(id);
            return ResultUtil.success();
        }
        return ResultUtil.error();
    }

    @PostMapping("/products")
    public ResultVO insertproduct(@RequestBody  ProductInfo productinfo){

        if(productinfo!=null){
            productService.insert(productinfo);
            return ResultUtil.success();
        }
        return ResultUtil.error();

    }
    @PutMapping("/products")
    public ResultVO updateproduct(@RequestBody ProductInfo productinfo){
        System.out.println(productinfo);
        productinfo.setCreatTime(null);
        productinfo.setUpdateTime(null);
        return ResultUtil.success();
    }


}
