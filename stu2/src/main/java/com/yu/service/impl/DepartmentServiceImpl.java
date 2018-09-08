package com.yu.service.impl;

import com.yu.entity.Department;
import com.yu.entity.DepartmentExample;
import com.yu.mapper.DepartmentMapper;
import com.yu.service.DepartmentService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yu on 2018/9/8 14:55.
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> findAll() {
        return departmentMapper.selectByExample(new DepartmentExample());
    }

    @Override
    public Department findById(Integer id) {
        return departmentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insert(Department department) {
        return departmentMapper.insert(department);
    }

    @Override
    public int deleteById(Integer id) {
        return departmentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateById(Department department) {

        return departmentMapper.updateByPrimaryKeySelective(department);
    }
}
