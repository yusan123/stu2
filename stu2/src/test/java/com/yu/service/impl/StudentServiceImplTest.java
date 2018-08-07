package com.yu.service.impl;

import com.yu.StuApplicationTests;
import com.yu.entity.Department;
import com.yu.entity.Student;
import com.yu.entity.Subject;
import com.yu.enums.Sex;
import com.yu.enums.StudentStatus;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by yu on 2018/8/4 23:39.
 */
public class StudentServiceImplTest extends StuApplicationTests{
    @Autowired
    private StudentServiceImpl studentService;

    @Test
    public void findById() throws Exception {
        Student student = studentService.findById(1112);
        Assert.assertEquals(new Integer(1112),student.getStudentId());
    }


    @Test
    public void findByStudentNo() throws Exception {
        Student student = studentService.findByStudentNo(20180001);
        Assert.assertEquals(new Integer(20180001),student.getStudentNo());
    }

    @Test
    public void save() throws Exception {
        Student student = new Student();
        student.setStudentNo("yu1111");
        student.setStudentAge(331);
        student.setStudentName("娟老啊");
        Department department = new Department();
        department.setDeptId(3);//工程建设学院
        student.setDepartment(department);
        student.setStudentSex(Sex.FEMALE.getCode());
        student.setStudentStatus(StudentStatus.NORMAL.getCode());
        Subject subject = new Subject();
        subject.setSubId(2);//信息系统与信息管理
        student.setSubject(subject);
        //student.setStudentDate(new Date());
        Student student1 = studentService.save(student);
        Assert.assertNotNull(student1);
    }

    @Test
    public void delete() throws Exception {
        studentService.delete(4);

    }

    @Test
    public void findAllStudent() throws Exception {
        List<Student> studentList = studentService.findAllStudent();
        Assert.assertTrue(studentList.size()>0);

    }

}