package com.wn.service.impl;

import com.wn.entity.OrderMaster;
import com.wn.mapper.OrderMasterMapper;
import com.wn.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderMasterMapper orderMasterMapper;
    @Override
    public List<OrderMaster> list() {
        return orderMasterMapper.selectByExample(null);
    }

    @Override
    public OrderMaster selectById(Integer id) {
        return orderMasterMapper.selectByPrimaryKey(id);
    }

    @Override
    public void insert(OrderMaster orderMaster) {
        if(orderMaster==null){}

        orderMasterMapper.insert(orderMaster);
    }

    @Override
    public void update(OrderMaster orderMaster) {
       if(orderMaster==null){

       }
       orderMasterMapper.updateByPrimaryKeySelective(orderMaster);
    }

    @Override
    public void delete(Integer id) {
        OrderMaster orderMaster = orderMasterMapper.selectByPrimaryKey(id);
        if(orderMaster==null){}

        orderMasterMapper.deleteByPrimaryKey(id);
    }


}
