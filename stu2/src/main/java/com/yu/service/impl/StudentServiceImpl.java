package com.yu.service.impl;

import com.github.pagehelper.PageHelper;
import com.yu.entity.Student;
import com.yu.entity.StudentExample;
import com.yu.mapper.StudentMapper;
import com.yu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yu on 2018/8/4 23:37.
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;


    @Override
    public List<Student> findPageByAgeDesc(Integer currPage, Integer pageSize) {
        PageHelper.startPage(currPage, pageSize);
        StudentExample studentExample = new StudentExample();
        //添加按照年龄降序排序
        studentExample.setOrderByClause("student_age desc");
        return studentMapper.selectByExample(studentExample);
    }


    @Override
    public List<Student> findAllStudent() {
        return studentMapper.selectByExample(new StudentExample());
    }


}
