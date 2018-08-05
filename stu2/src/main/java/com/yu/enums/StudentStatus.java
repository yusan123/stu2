package com.yu.enums;

import lombok.Getter;

/**
 * Created by yu on 2018/8/5 11:49.
 */
@Getter
public enum StudentStatus {
    NORMAL(0,"正常"),
    GRADUATE(1,"毕业"),
    XIUXUE(2,"休学"),
    TUIXUE(3,"退学")
    ;
    private int code;
    private String msg;

    StudentStatus(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
