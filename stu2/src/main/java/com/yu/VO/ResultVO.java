package com.yu.VO;

import lombok.Data;

/**
 * Created by yu on 2018/8/6 21:47.
 */
@Data
public class ResultVO<T> {

    private Integer code;
    private String msg;
    private T data;

    public ResultVO() {
        super();
    }

    public ResultVO(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
