package com.yu.service.impl;

import com.yu.entity.Student;
import com.yu.enums.ResultEnum;
import com.yu.exception.StudentException;
import com.yu.repository.StudentRepository;
import com.yu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
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
