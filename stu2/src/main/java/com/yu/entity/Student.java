package com.yu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Integer studentId;

    private String studentNo;

    private String studentName;

    private Integer studentAge;

    private Byte studentSex;

    private Integer subjectNo;

    private Integer deptNo;

    private Byte studentStatus;


}