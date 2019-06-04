package com.wn.enums;

import lombok.Getter;

@Getter
public enum ResultCodeEnums {

    OK(0,"成功"),
    ERROR(1,"失败");

    /**
     * 状态码
     */
    private Integer Code;
    /**
     * 状态码信息
     */
    private String meg;

    ResultCodeEnums(Integer code, String meg) {
        this.Code = code;
        this.meg = meg;
    }
}
