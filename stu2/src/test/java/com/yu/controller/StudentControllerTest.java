package com.yu.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.Assert.*;

/**
 * Created by yu on 2018/8/9 23:31.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class StudentControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getAgeById() throws Exception {
    }

    @Test
    public void findAll() throws Exception {
    }

    @Test
    public void save() throws Exception {
    }

    @Test
    public void findById() throws Exception {
    }

    @Test
    public void findByStudentNo() throws Exception {
    }

    @Test
    public void delete() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.delete("/student/12"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

}