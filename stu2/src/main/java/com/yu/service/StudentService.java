package com.yu.service;

import com.yu.entity.Student;

import java.util.List;

/**
 * Created by yu on 2018/8/4 23:36.
 */
public interface StudentService {
    //不分页查询
    List<Student> findAllStudent();

    List<Student> findPageByAgeDesc(Integer currPage,Integer pageSize);
}
