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
    WEICHENGNIAN(4,"你还为成年"),
    GONGZUODEREN(5,"工作吧青年"),
    TUIXIUDEREN(6,"已经退休啦"),
    ID_NOT_EXIST(101,"没有该id的学生")
    ;
    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
