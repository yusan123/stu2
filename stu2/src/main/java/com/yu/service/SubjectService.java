package com.yu.service;

import com.yu.entity.Subject;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yu on 2018/8/5 11:04.
 */

public interface SubjectService {
    List<Subject> findAll();
    List<Subject> findByDeptNo(Integer no);
}
