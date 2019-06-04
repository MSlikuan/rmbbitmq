package com.wn.controller;

import com.wn.entity.OrderMaster;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
@Slf4j
@RestController
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/order")
    public String productlist(){
        return restTemplate.getForObject("http://eureka-client2/order",String.class);
    }

    @GetMapping("/order/{id}")
    public  String selectid(@PathVariable String id){
        System.out.println(id);
        return restTemplate.getForObject("http://eureka-client2/order/"+id,String.class);
    }

    @DeleteMapping("/order/{id}")
    public String deleteid(@PathVariable String id){
        try {
            restTemplate.delete("http://eureka-client2/order/"+id);
            return "success";
        }catch (Exception e){
            return "error";
        }
    }
    @PostMapping("/order")
    public String insertproduct(OrderMaster orderMaster){
        log.info("接受参数={}",orderMaster);
        return restTemplate.postForObject("http://eureka-client2/order",orderMaster,String.class);
    }

    @PutMapping("/order")
    public String updateproduct( OrderMaster orderMaster){
        try {
            restTemplate.put("http://eureka-client2/order", orderMaster);
            return "success";
        }catch (Exception e){
            return "error";
        }

    }
}
