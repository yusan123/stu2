package com.yu.enums;

import lombok.Data;
import lombok.Getter;

/**
 * Created by yu on 2018/8/5 11:44.
 */
@Getter
public enum Sex {
    MALE(0,"男"),
    FEMALE(1,"女")
    ;

    private int code;
    private String msg;

    Sex(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
