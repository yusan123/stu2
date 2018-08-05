package com.yu.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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

}
