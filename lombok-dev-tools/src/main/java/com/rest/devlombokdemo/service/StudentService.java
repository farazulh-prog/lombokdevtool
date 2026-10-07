package com.rest.devlombokdemo.service;

import com.rest.devlombokdemo.entity.Student;
import com.rest.devlombokdemo.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public List<Student> findAll() {
        return studentRepo.findAll();
    }

    public Student findById(int id) {
        return studentRepo.findById(id).get();
    }

    public  void save(Student student) {
        studentRepo.save(student);
    }
}
