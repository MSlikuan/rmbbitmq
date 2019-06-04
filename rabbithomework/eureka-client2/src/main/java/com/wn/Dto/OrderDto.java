package com.wn.Dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
@Data
public class OrderDto implements Serializable {
    private Integer productId;
    private Integer orderId;

    private String buyerName;

    private String buyerPhone;

    private String buyerAddress;

    private String buyerOpenid;

    private BigDecimal orderAmount;

    private Byte orderStauts;

    private Byte payStatus;

    private Date creatTime;

    private Date updateTime;

    @Override
    public String toString() {
        return "OrderDto{" +
                "productId=" + productId +
                ", orderId=" + orderId +
                ", buyerName='" + buyerName + '\'' +
                ", buyerPhone='" + buyerPhone + '\'' +
                ", buyerAddress='" + buyerAddress + '\'' +
                ", buyerOpenid='" + buyerOpenid + '\'' +
                ", orderAmount=" + orderAmount +
                ", orderStauts=" + orderStauts +
                ", payStatus=" + payStatus +
                ", creatTime=" + creatTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
