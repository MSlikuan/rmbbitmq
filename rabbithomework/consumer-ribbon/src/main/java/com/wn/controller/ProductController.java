package com.wn.controller;

import com.wn.entity.Productinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
@RestController
public class ProductController {
    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/products")
    public String productlist(){
        return restTemplate.getForObject("http://eureka-client1/products",String.class);
    }

    @GetMapping("/products/{id}")
    public  String selectid(@PathVariable String id){
        System.out.println(id);
        return restTemplate.getForObject("http://eureka-client1/products/"+id,String.class);
    }

    @DeleteMapping("/products/{id}")
    public String deleteid(@PathVariable String id){
        System.out.println(id);
        try {
            restTemplate.delete("http://eureka-client1/products/"+id);
            return "success";
        }catch (Exception e){
            return "error";
        }
    }
    @PostMapping("/products")
    public String insertproduct(Productinfo productinfo){
        return restTemplate.postForObject("http://eureka-client1/products",productinfo,String.class);
    }

    @PutMapping("/products")
    public String updateproduct( Productinfo productinfo){
        try {

            restTemplate.put("http://eureka-client1/products",productinfo);
            return "success";
        }catch (Exception e){
            return "error";
        }

    }
}
