package com.yu.controller;

import com.yu.entity.Student;
import com.yu.service.StudentService;
import com.yu.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by yu on 2018/8/4 23:41.
 *
 * 不用多表关联的方式去查询，与数据库对应的实体与数据库完全对应，比如学生表中保存了它的专业编号，常规做法是关联查询
 * 现在是创建一个视图对象，把学生实体信息拷贝到这个对象中去，在查出他的专业编号对应的专业名称，设置进返回给前台的VO中
 */
@Controller
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/all")
    public Object findAll(Map<String,Object> map){
        try {
            map.put("res",studentService.findAllStudent());
            return "all";
            //return ResultUtil.success(studentService.findAllStudent());
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.error();
        }
    }
    @GetMapping("/all2")
    @ResponseBody
    public Object findAll2(Map<String,Object> map){
        try {
            return studentService.findAllStudent();
            //return ResultUtil.success(studentService.findAllStudent());
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.error();
        }
    }

    @PostMapping
    public Object save(@RequestBody Student student){
        return studentService.save(student);
    }

    @GetMapping("/{id}")
    public Object findById(@PathVariable Integer id){
        return studentService.findById(id);
    }

    @GetMapping("/{studentNo}")
    public Object findByStudentNo(@PathVariable Integer studentNo){
        return studentService.findByStudentNo(studentNo);
    }

    @DeleteMapping("/{id}")
    public Object delete(@PathVariable Integer id){
        try {
            studentService.delete(id);
            return  "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }
}
