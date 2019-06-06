package com.wn.controller;

import com.wn.entity.Productinfo;
import com.wn.service.ProductInfoService;
import com.wn.util.ResultUtil;
import com.wn.vo.Resultvo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class ProductInfoController {

    @Autowired
    private ProductInfoService productInfoService;

    @GetMapping("/products")
    public Resultvo productlist(){

        return ResultUtil.success(productInfoService.selectPrdouct());
    }
    @GetMapping("/products/{id}")
    public  Resultvo selectid(@PathVariable String id){
              Productinfo productinfo=productInfoService.selectById(id);
              if(productinfo!=null){
                  return ResultUtil.success(productinfo);
              }
             return ResultUtil.error();
    }

    @DeleteMapping("/products/{id}")
    public Resultvo deleteid(@PathVariable String id){
        System.out.println(id);
        Productinfo productinfo=productInfoService.selectById(id);
        if(productinfo!=null){
            System.out.println(111);
            productInfoService.deleteById(id);
            return ResultUtil.success();
        }
        return ResultUtil.error();
    }

    @PostMapping("/products")
    public Resultvo insertproduct(@RequestBody  Productinfo productinfo){

        System.out.println(productinfo);
        if(productinfo!=null){
            productInfoService.insert(productinfo);
            return ResultUtil.success();
        }
        return ResultUtil.error();

    }
    @PutMapping("/products")
    public Resultvo updateproduct(@RequestBody  Productinfo productinfo){
        System.out.println(productinfo);
        productinfo.setCreatTime(null);
        productinfo.setUpdateTime(null);
        productInfoService.update(productinfo);
        return ResultUtil.success();
    }
}
