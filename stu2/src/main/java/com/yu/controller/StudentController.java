package com.yu.controller;

import com.yu.VO.ResultVO;
import com.yu.entity.Student;
import com.yu.enums.ResultEnum;
import com.yu.exception.StudentException;
import com.yu.service.StudentService;
import com.yu.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by yu on 2018/8/4 23:41.
 * <p>
 * 不用多表关联的方式去查询，与数据库对应的实体与数据库完全对应，比如学生表中保存了它的专业编号，常规做法是关联查询
 * 现在是创建一个视图对象，把学生实体信息拷贝到这个对象中去，在查出他的专业编号对应的专业名称，设置进返回给前台的VO中
 */
@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;


    @GetMapping("/age/{id}")
    public Object getAgeById(@PathVariable("id") Integer id) {
        int a = 1 / 0;
        return studentService.getAgeById(id);
    }

    @GetMapping("/all")
    public Object findAll(Map<String, Object> map) {
        map.put("res", studentService.findAllStudent());
        return ResultUtil.success(studentService.findAllStudent());
    }

    @PostMapping
    public Object save(@RequestBody Student student) {
        return studentService.save(student);
    }

    @GetMapping("/{id}")
    public Object findById(@PathVariable Integer id) {
        Student student = studentService.findById(id);
        if (student == null) {
            throw new StudentException(ResultEnum.ID_NOT_EXIST);
        } else {
            return ResultUtil.success(student);
        }
    }

    @GetMapping("/byNo/{studentNo}")
    public Object findByStudentNo(@PathVariable Integer studentNo) {
        return studentService.findByStudentNo(studentNo);
    }

    @DeleteMapping("/{id}")
    public ResultVO delete(@PathVariable Integer id) {
        Student student = studentService.findById(id);
        studentService.delete(id);
        return ResultUtil.success();

    }
}
