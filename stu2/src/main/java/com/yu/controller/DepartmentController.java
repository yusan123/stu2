package com.yu.controller;

import com.yu.entity.Department;
import com.yu.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by yu on 2018/8/5 11:34.
 */
@Slf4j
@RestController
@RequestMapping("/dept")
@CrossOrigin
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/all")
    public Object findAll(){
        return departmentService.findAll();
    }

    @GetMapping("/{id}")
    public Object findById(@PathVariable Integer id){
        return departmentService.findById(id);
    }

    @PostMapping("/add")
    public Object insert(@RequestBody Department department){
        int i = departmentService.insert(department);
        log.info("add return i is {}",i);
        return department;
    }
    @DeleteMapping("/del/{id}")
    public Object delete(@PathVariable Integer id){
        Department department = departmentService.findById(id);
        int i = departmentService.deleteById(id);
        log.info("delete return i is {}",i);
        return department;

    }
    @PutMapping("/update")
    public Object update(@RequestBody Department department){
        int i = departmentService.updateById(department);
        log.info("update return i is {}",i);
        return department;
    }



}
