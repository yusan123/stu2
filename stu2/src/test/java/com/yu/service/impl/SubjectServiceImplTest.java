package com.yu.service.impl;

import com.yu.StuApplicationTests;
import com.yu.entity.Subject;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by yu on 2018/8/5 12:37.
 */
public class SubjectServiceImplTest extends StuApplicationTests{
    @Autowired
    private SubjectServiceImpl subjectService;

    @Test
    public void findAll() throws Exception {
    }

    @Test
    public void findByDeptNo() throws Exception {
        List<Subject> byDeptNo = subjectService.findByDeptNo(1);
        Assert.assertTrue(byDeptNo.size()>0);
    }

}