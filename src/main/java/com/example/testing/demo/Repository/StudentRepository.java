package com.example.testing.demo.Repository;

import com.example.testing.demo.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
    public Student findByFirstName(String firstName);
}
