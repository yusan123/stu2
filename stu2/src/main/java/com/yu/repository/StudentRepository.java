package com.yu.repository;

import com.yu.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by yu on 2018/8/4 23:07.
 */
public interface StudentRepository extends JpaRepository<Student,Integer>{

    Student findByStudentNo(Integer no);

    //Page<Student> findAll(Pageable pageable);

}
