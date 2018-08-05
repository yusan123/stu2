package com.yu.repository;

import com.yu.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by yu on 2018/8/5 11:03.
 */
public interface DepartmentRepository extends JpaRepository<Department,Integer>{
}
