package com.yu.repository;

import com.yu.StuApplicationTests;
import com.yu.entity.Student;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;



/**
 * Created by yu on 2018/8/4 23:09.
 */
public class StudentRepositoryTest extends StuApplicationTests{
    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void testListStudents(){
        List<Student> studentList = studentRepository.findAll();
        Assert.assertTrue(studentList.size()>0);
    }

    /*@Test
    public void testFindByStudentNo(){
        Student student = studentRepository.findByStudentNo(20180004);
        Assert.assertEquals(new Integer(20180004),student.getStudentNo());
    }*/
    @Test
    public void testupdate(){
    }
}