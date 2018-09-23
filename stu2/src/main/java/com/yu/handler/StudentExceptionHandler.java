package com.yu.handler;

import com.yu.VO.ResultVO;
import com.yu.exception.StudentException;
import com.yu.utils.ResultUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by yu on 2018/8/9 22:31.
 */
@ControllerAdvice
@ResponseBody
public class StudentExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResultVO handler(Exception e) {
        if(e instanceof StudentException){
            StudentException studentException = (StudentException) e;
            return ResultUtil.error(studentException.getCode(),studentException.getMessage());
        }
        return ResultUtil.error(-1,e.getMessage());
    }
}
