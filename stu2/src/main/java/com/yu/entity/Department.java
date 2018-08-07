package com.yu.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by yu on 2018/8/4 23:05.
 * --院系信息表
 create table `department` (
 `dept_id` int auto_increment,
 `dept_name` varchar(20) not null comment '院系名称',
 primary key (`dept_id`)
 );
 */
@Entity
@Data
public class Department {
    @Id
    @GeneratedValue
    private Integer deptId;
    private String deptName;
    @JsonIgnore
    @OneToMany(targetEntity = Student.class,mappedBy = "department")
    //不存在级联操作，不会存在新增学生新增学院或者专业
    private Set<Student> students = new HashSet<>();

}
