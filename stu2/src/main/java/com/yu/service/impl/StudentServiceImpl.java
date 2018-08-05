package com.yu.service.impl;

import com.yu.entity.Student;
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
        Student student = optional.get();
        return student;
    }

    @Override
    public Student findByStudentNo(Integer no) {
        return studentRepository.findByStudentNo(no);
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
