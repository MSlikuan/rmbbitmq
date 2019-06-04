package com.wn.service;

import com.wn.entity.OrderMaster;

import java.util.List;

public interface OrderService {
    List<OrderMaster>  list();

    OrderMaster selectById(Integer id);

    void insert(OrderMaster orderMaster);

    void update(OrderMaster orderMaster);

    void delete(Integer id);

}
