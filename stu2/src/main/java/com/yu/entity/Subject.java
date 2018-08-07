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
 * Created by yu on 2018/8/4 23:03.
 * create table `subject` (
 `sub_id` int auto_increment,
 `sub_name` varchar(20) not null comment '专业名称',
 `dept_no` int not null comment '院系编号',
 primary key (`sub_id`)
 );
 */
@Entity
@Data
public class Subject {

    @Id
    @GeneratedValue
    private Integer subId;

    private String subName;
    private Integer deptNo;
    @JsonIgnore
    @OneToMany(targetEntity = Student.class,mappedBy = "department")
    private Set<Student> students = new HashSet<>();

}
