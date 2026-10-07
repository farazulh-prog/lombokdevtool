package com.rest.devlombokdemo.controller;

import com.rest.devlombokdemo.entity.Student;
import com.rest.devlombokdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/all")
    public List<Student> findAll() {
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    public Student findById(@PathVariable Integer id) {
        return studentService.findById(id);
    }
}

//http://localhost:9000/student/all
//http://localhost:9000/student/6
