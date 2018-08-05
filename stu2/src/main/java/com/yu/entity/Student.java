package com.yu.entity;

import lombok.Data;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.Date;

/**
 * Created by yu on 2018/8/4 22:56.
 * `student_id` INT AUTO_INCREMENT,
 `student_no` INT NOT NULL UNIQUE COMMENT '学号',
 `student_name` VARCHAR(10) NOT NULL COMMENT '姓名',
 `student_age` INT NOT NULL COMMENT '年龄',
 `student_sex` TINYINT(3) NOT NULL COMMENT '学生性别0表示男1表示女',
 `subject_no` INT NOT NULL COMMENT '专业编号',
 `dept_no` INT NOT NULL COMMENT '院系编号',
 `student_status` TINYINT(5) DEFAULT '0' COMMENT '学生状态0是在校1已毕业2休学3退学',
 `student_d
 */
@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId;
    private String studentNo;
    private String studentName;
    private Integer studentSex;
    private Integer studentAge;
    private Integer subjectNo;
    private Integer deptNo;
    private Integer studentStatus;
    //private Date studentDate;

}
