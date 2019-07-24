package com.example.testing.demo.controller;

import com.example.testing.demo.model.Student;
import com.example.testing.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/student")
public class StudentContoller {

    @Autowired
    StudentService service;

    @PostMapping
    public Student saveStudent(@RequestBody  Student student){
        return service.saveStudent(student);
    }

    @GetMapping(value="/{id}")
    public Student getStudent(@PathVariable String id){
        return service.getStudent(id);
    }

}
