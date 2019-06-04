package com.wn.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class RabbitConfig {
    /**
     * 声明一个队列
     * @return
     */
    @Bean
    public Queue queue(){
        return new Queue("date");
    }

}
