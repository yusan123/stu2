package com.yu.repository;

import com.yu.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by yu on 2018/8/5 11:02.
 */
public interface SubjectRepository extends JpaRepository<Subject,Integer> {
    List<Subject> findByDeptNo(Integer no);
}
