package com.yu.controller;

import com.yu.entity.Subject;
import com.yu.service.SubjectService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by yu on 2018/8/5 11:32.
 */
@RestController
@RequestMapping("/subject")
@CrossOrigin
@Slf4j
public class SubjectController {
    @Autowired
    private SubjectService subjectService;

    @GetMapping("/all")
    public Object findAll(){
        return subjectService.findAll();
    }

}
