package com.yu.utils;

import com.yu.VO.ResultVO;
import com.yu.enums.ResultEnum;

/**
 * Created by yu on 2018/8/6 21:51.
 */
public class ResultUtil {

    //成功有数据
    public static ResultVO success(Object data){
        ResultVO<Object> resultVO = new ResultVO<>();
        resultVO.setCode(ResultEnum.SUCCESS.getCode());
        resultVO.setMsg(ResultEnum.SUCCESS.getMsg());
        resultVO.setData(data);
        return resultVO;
    }

    //成功无数据
    public static ResultVO success(){
        return success(null);
    }

    //异常
    public static ResultVO error(Integer code,String msg){
        ResultVO<Object> resultVO = new ResultVO<>();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }

}
