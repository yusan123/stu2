package com.yu.enums;

import lombok.Getter;

/**
 * Created by yu on 2018/8/6 21:48.
 */
@Getter
public enum ResultEnum {
    SUCCESS(1,"成功"),
    ERROR(2,"出错"),
    OTHER(3,"其他"),
    ;
    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
