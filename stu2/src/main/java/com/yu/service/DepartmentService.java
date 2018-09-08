package com.yu.service;

import com.yu.entity.Department;

import java.util.List;

/**
 * Created by yu on 2018/8/5 11:26.
 */
public interface DepartmentService {

    List<Department> findAll();

    Department findById(Integer id);

    int insert(Department department);

    int deleteById(Integer id);

    int updateById(Department department);
}
