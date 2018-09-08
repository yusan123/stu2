package com.yu.service.impl;

import com.yu.entity.Subject;
import com.yu.entity.SubjectExample;
import com.yu.mapper.SubjectMapper;
import com.yu.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yu on 2018/8/5 11:21.
 */
@Service
public class SubjectServiceImpl implements SubjectService{

    @Autowired
    private SubjectMapper subjectMapper;


    public List<Subject> findAll() {
        return subjectMapper.selectByExample(new SubjectExample());
    }



}
