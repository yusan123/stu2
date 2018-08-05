package com.yu.service.impl;

import com.yu.entity.Subject;
import com.yu.repository.SubjectRepository;
import com.yu.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yu on 2018/8/5 11:21.
 */
@Service
public class SubjectServiceImpl implements SubjectService {
    @Autowired
    private SubjectRepository subjectRepository;
    @Override
    public List<Subject> findAll() {
        return subjectRepository.findAll();
    }

    @Override
    public List<Subject> findByDeptNo(Integer no) {
        return subjectRepository.findByDeptNo(no);
    }
}
