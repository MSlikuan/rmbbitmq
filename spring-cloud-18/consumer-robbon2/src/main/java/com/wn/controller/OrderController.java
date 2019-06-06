package com.wn.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wn.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/login")
    private String viwe(User user){
        log.info("接受的用户：{}",user.getName());
        log.info("接受的密码为：{}",user.getPass());
        return  restTemplate.postForObject("http://eureka-client2/login?pass="+user.getPass(),user,String.class);
    }

    @PostMapping("/register")
    private String save(User user){
        log.info("接受的用户：{}",user.getName());
        log.info("接受的密码为：{}",user.getPass());

        return  restTemplate.postForObject("http://eureka-client2/register?pass="+user.getPass(),user,String.class);
    }

  /*  public String error(String name){

        return "sorry ! 服务器故障 " +name;
    }*/
}
