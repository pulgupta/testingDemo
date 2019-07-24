package com.example.testing.demo.integrationTest;

import com.example.testing.demo.repository.StudentRepository;
import com.example.testing.demo.model.Student;
import com.example.testing.demo.service.StudentService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class StudentServiceIntegrationTest {

    @Autowired
    StudentService service;

    @Autowired
    StudentRepository repository;

    @Test
    public void createStudentSuccessTest() {
        Student student = Student.builder()
                .rollNumber("UE6349")
                .firstName("Pulkit")
                .lastName("Gupta1")
                .age(31)
                .build();
        Student student1 = service.saveStudent(student);
        Assert.assertNotNull(student1.getRecordIdentifier());
    }
}
