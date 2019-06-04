package com.wn.Controller;

import com.wn.Dto.OrderDto;
import com.wn.entity.OrderMaster;
import com.wn.service.OrderService;
import com.wn.util.ResultUtil;
import com.wn.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.SerializationUtils;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class OrederController {

    @Autowired
    private OrderService orderService;
    /**
     * 消息发送
     */
    @Autowired
    private AmqpTemplate amqpTemplate;

    //新增订单
    @PostMapping("/order")
    public ResultVO insertOrder(@RequestBody OrderMaster orderMaster){
        System.out.println(orderMaster.getProductId());
        log.info("新增订单： orderMaster{}" ,orderMaster);
        if(orderMaster!=null){
            System.out.println(1111);
            log.info("发送消息为： "+orderMaster);
            orderService.insert(orderMaster);
            amqpTemplate.convertAndSend("date",SerializationUtils.serialize(orderMaster));
            return ResultUtil.success();
        }
            return ResultUtil.error();
    }
   // 查询所有订单
    @GetMapping("/order")
    public ResultVO list(){
        return ResultUtil.success(orderService.list());
    }
    //根据id查询单条订单
    @GetMapping("/order/{id}")
    public ResultVO selectById(@PathVariable Integer id){
        return ResultUtil.success(orderService.selectById(id));
    }



   // 根据id 删除单条订单
    @DeleteMapping("/order/{id}")
    public ResultVO removeById(@PathVariable Integer id){
        orderService.delete(id);
        return ResultUtil.success();
    }
    // 更新订单
    @PutMapping("/order")
    public ResultVO update(OrderMaster orderMaster){
          log.info("更新订单： order{}",orderMaster);
          if(orderMaster==null){
              return ResultUtil.error();
          }
          orderService.update(orderMaster);
          return ResultUtil.success();
    }
}
