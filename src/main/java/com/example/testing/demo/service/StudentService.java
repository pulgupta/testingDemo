package com.example.testing.demo.service;

import com.example.testing.demo.Repository.StudentRepository;
import com.example.testing.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class StudentService {

    @Autowired
    StudentRepository repository;

    public Student saveStudent(Student student) {
        student.setRecordIdentifier(UUID.randomUUID().toString());
        return repository.save(student);
    }

    public Student getStudent(String id) {
        return repository.findById(id).get();
    }
}
