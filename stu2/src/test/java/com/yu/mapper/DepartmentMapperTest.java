package com.yu.mapper;

import com.yu.StuApplicationTests;
import com.yu.entity.Department;
import com.yu.entity.DepartmentExample;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by yu on 2018/9/8 14:22.
 */
public class DepartmentMapperTest extends StuApplicationTests{

    @Autowired
    private DepartmentMapper departmentMapper;

    @Test
    public void countByExample() throws Exception {
        int i = departmentMapper.countByExample(new DepartmentExample());
        System.out.println(i);
    }

    @Test
    public void deleteByPrimaryKey() throws Exception {
        int i = departmentMapper.deleteByPrimaryKey(6);
        Assert.assertTrue(i==1);
    }

    @Test
    public void insert() throws Exception {
        Department department = new Department();
        department.setDeptName("农学院");
        int insert = departmentMapper.insert(department);

    }

    /**
     * 查询所有id大于2的学院
     * @throws Exception
     */
    @Test
    public void selectByExample() throws Exception {
        DepartmentExample departmentExample =new DepartmentExample();
        DepartmentExample.Criteria criteria = departmentExample.createCriteria().andDeptIdGreaterThan(2);
        List<Department> list = departmentMapper.selectByExample(departmentExample);
        list.forEach(System.out::println);
    }

    @Test
    public void selectByPrimaryKey() throws Exception {
        Department department = departmentMapper.selectByPrimaryKey(2);
        System.out.println(department);
    }

    @Test
    public void updateByPrimaryKeySelective(){
        Department department = new Department();
        department.setDeptId(4);
        department.setDeptName("软件学院");
        int i = departmentMapper.updateByPrimaryKeySelective(department);
        Assert.assertTrue(i==1);
    }

}