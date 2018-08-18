package com.yu.exception;

import com.yu.enums.ResultEnum;
import lombok.Data;

/**
 * Created by yu on 2018/8/9 22:36.
 */
@Data
public class StudentException extends RuntimeException {
    private int code;

    public StudentException(int code,String message) {
        super(message);
        this.code=code;
    }

    public StudentException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }
}
