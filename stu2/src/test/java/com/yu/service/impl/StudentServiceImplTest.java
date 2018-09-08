package com.yu.service.impl;

import com.yu.StuApplicationTests;
import com.yu.entity.Student;
import com.yu.service.StudentService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by yu on 2018/9/8 16:07.
 */
public class StudentServiceImplTest extends StuApplicationTests{

    @Autowired
    private StudentService studentService;
    @Test
    public void findPageByAgeDesc() throws Exception {
        List<Student> pageByAgeDesc = studentService.findPageByAgeDesc(1, 3);
        pageByAgeDesc.forEach(System.out::println);

    }

}