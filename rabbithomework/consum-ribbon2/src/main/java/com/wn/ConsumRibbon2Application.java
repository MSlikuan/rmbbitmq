package com.wn;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableHystrix
public class ConsumRibbon2Application {

    public static void main(String[] args) {
        SpringApplication.run(ConsumRibbon2Application.class, args);
    }
    //开启负载均衡
    @Bean
    @LoadBalanced  //开启负载均衡
    public RestTemplate restTemplate(){

        return new RestTemplate();
    }
}
