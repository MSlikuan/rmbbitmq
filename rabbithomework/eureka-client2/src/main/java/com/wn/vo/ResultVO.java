package com.wn.vo;

import lombok.Data;

import java.io.Serializable;
@Data
public class ResultVO<T> implements Serializable {
     //虚拟机是否允许反序列化，不仅取决于类路径和功能代码是否一致，一个非常重要的一点是两个类的序列化 ID 是否一致
    // （就是 private static final long serialVersionUID = 1L）。清单 1 中，虽然两个类的功能代码完全一致，
    // 但是序列化 ID 不同，他们无法相互序列化和反序列化。设置序列化ID
     private static final long serialVersionUID = -6463033438238617190L;

     //定义状态吗 1表示未成功，0 表示成功
    private Integer code;

    //定义返回字段
    private  String message;

    //定义返回数据
    private T data;


}
