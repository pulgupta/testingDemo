package com.example.testing.demo.unitTest;

import com.example.testing.demo.Repository.StudentRepository;
import com.example.testing.demo.model.Student;
import com.example.testing.demo.service.StudentService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

import static org.mockito.Mockito.when;

@SpringBootTest
@RunWith(SpringRunner.class)
public class StudentServiceUnitTest {

    // Even though we are creating the mock after actually creating the enclosing
    // object, still mockito will be able to do this perfectly.
    @InjectMocks
    StudentService service;

    @Mock
    StudentRepository repository;

    @Test
    public void createStudentSuccessTest() {
        Student student = Student.builder()
                .rollNumber("UE6349")
                .firstName("Pulkit")
                .lastName("Gupta1")
                .age(31)
                .build();
        when(repository.save(student)).thenReturn(student);
        Student student1 = service.saveStudent(student);
        Assert.assertNotNull(student1.getRecordIdentifier());
    }
}
