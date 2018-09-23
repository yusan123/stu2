package com.yu.service.impl;

import com.yu.entity.Student;
import com.yu.enums.ResultEnum;
import com.yu.exception.StudentException;
import com.yu.repository.StudentRepository;
import com.yu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by yu on 2018/8/4 23:37.
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public List<Student> findAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(Integer id) {
        Optional<Student> optional = studentRepository.findById(id);
        if(!optional.isPresent()){
            throw new StudentException(ResultEnum.ID_NOT_EXIST);
        }
        Student student = optional.get();
        return student;
    }

    @Override
    public Student findByStudentNo(Integer no) {
        return studentRepository.findByStudentNo(no);
    }

    /**
     * 使用jpa 2.0的分页排序查询
     * @param pageNo  页码
     * @param pageSize 每页显示的大小
     * @return
     */
    @Override
    public List<Student> findByPage(Integer pageNo, Integer pageSize) {
        /*// 过时的写法
        return studentRepository.findAll(new PageRequest(pageNo-1,pageSize)).getContent();*/


        PageRequest of = PageRequest.of(pageNo-1, pageSize,new Sort(Sort.Direction.DESC,"studentAge"));
        Page<Student> studentPage = studentRepository.findAll(of);
        //studentPage.getContent().forEach(System.out::println);   //这行代码会导致循环引用，栈内存溢出
        return studentPage.getContent();
    }

    /**
     * 根据学生的id返回它的年龄
     * @param id
     * @return
     */
    @Override
    public Integer getAgeById(Integer id) throws RuntimeException{
        Integer age = findById(id).getStudentAge();
        /*if(age<18){
            throw new RuntimeException("你还为成年");
        }else if(age >=18 && age <=60){
            throw new RuntimeException("工作吧青年");
        }else{
            throw new RuntimeException("已经退休啦");
        }*/
        if(age<18){
            throw new StudentException(ResultEnum.WEICHENGNIAN);
        }else if(age >=18 && age <=60){
            throw new StudentException(ResultEnum.GONGZUODEREN);
        }else{
            throw new StudentException(ResultEnum.TUIXIUDEREN);
        }
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void delete(Integer id) {
        studentRepository.deleteById(id);
    }
}
