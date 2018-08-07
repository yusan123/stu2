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
    //学号
    private String studentNo;
    //学生姓名
    private String studentName;
    //性别 学生性别0表示男1表示女
    private Integer studentSex;
    //年龄
    private Integer studentAge;
    //专业
    @ManyToOne(targetEntity =Subject.class)
    @JoinColumn(name="subject_no")
    private Subject subject;
    //学院
    @ManyToOne(targetEntity = Department.class)
    @JoinColumn(name="dept_no")
    private Department department;
    //学生的状态  学生状态0是在校1已毕业2休学3退学
    private Integer studentStatus;
    //private Date studentDate;

}
