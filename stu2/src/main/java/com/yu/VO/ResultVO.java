package com.yu.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by yu on 2018/8/6 21:47.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultVO<T> {

    private Integer code;
    private String msg;
    private T data;

}
