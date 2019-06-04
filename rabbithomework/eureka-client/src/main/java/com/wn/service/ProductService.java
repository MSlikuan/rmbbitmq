package com.wn.service;

import com.wn.entity.ProductInfo;
import org.springframework.amqp.core.Message;


import java.util.List;
import com.rabbitmq.client.Channel;
public  interface   ProductService {
    List<ProductInfo> list();

    ProductInfo selectById(Integer id);

    void insert(ProductInfo productInfo);

    void update(Message message, Channel channel);

    void delete(Integer id);
}
