package com.wn.service.impl;

import com.wn.entity.OrderMaster;
import com.wn.entity.ProductInfo;
import com.wn.mapper.ProductInfoMapper;
import com.wn.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.SerializationUtils;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import org.springframework.amqp.core.Message;

import javax.annotation.Resource;
import com.rabbitmq.client.Channel;

import java.math.BigDecimal;
import java.util.List;

@Service
@Slf4j
public class ProductServiceImpl implements ProductService {

    @Resource
    private ProductInfoMapper productInfoMapper;

    @Override
    public ProductInfo selectById(Integer id) {
        return productInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public void insert(ProductInfo productInfo) {
        if(productInfo==null){

        }
        productInfoMapper.insert(productInfo);
    }
    //更新商品


    @RabbitListener(queues = "date")
    public void update(Message message,Channel channel) {
        OrderMaster orderMaster = SerializationUtils.deserialize(message.getBody());
        log.info("接受到消息：orderMaster={}",orderMaster);
        try {

            ProductInfo productInfo = productInfoMapper.selectByPrimaryKey(orderMaster.getProductId());

            BigDecimal bigDecimal=orderMaster.getOrderAmount().divide(productInfo.getProdutcPrice());
            int socket=bigDecimal.intValue();
            Integer sockets = productInfo.getProdutcStock()-socket;
            log.info("数量等于={}",sockets);
            productInfo.setProdutcStock(sockets);
            productInfoMapper.updateByPrimaryKeySelective(productInfo);
         //   channel.basicAck(message.getMessageProperties().getDeliveryTag(),false);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void delete(Integer id) {
        ProductInfo productInfo = productInfoMapper.selectByPrimaryKey(id);
        if(productInfo==null){

          }
          productInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<ProductInfo> list() {
        return productInfoMapper.selectByExample(null);
    }
}
