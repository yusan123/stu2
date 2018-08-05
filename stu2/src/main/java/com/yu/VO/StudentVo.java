package com.yu.VO;

import lombok.Data;

import java.util.Date;

/**
 * Created by yu on 2018/8/5 10:56.
 */
@Data
public class StudentVo {
    private Integer studentId;
    private Integer studentNo;
    private String studentName;
    private Integer studentSex;
    private Integer studentAge;
    private String subject;
    private String dept;
    private Integer studentStatus;
    private Date studentDate;
}
