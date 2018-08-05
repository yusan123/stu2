package com.yu.service;

import com.yu.entity.Student;

import java.util.List;

/**
 * Created by yu on 2018/8/4 23:36.
 */
public interface StudentService {
    //不分页查询所有
    List<Student> findAllStudent();
    //根据id查询一个
    Student findById(Integer id);
    //根据学生学号查询学生信息
    Student findByStudentNo(Integer no);
    //新增
    Student save(Student student);
    //根据id删除
    void delete(Integer id);
}
