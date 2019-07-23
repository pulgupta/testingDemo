package com.example.testing.demo.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Value;
import org.springframework.data.annotation.Id;

import java.util.Objects;

@Data
@Builder
public class Student {

    @Id
    String rollNumber;
    String firstName;
    String lastName;
    int age;
    String recordIdentifier;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(rollNumber, student.rollNumber) &&
                Objects.equals(firstName, student.firstName) &&
                Objects.equals(lastName, student.lastName) &&
                Objects.equals(recordIdentifier, student.recordIdentifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNumber, firstName, lastName, age, recordIdentifier);
    }
}
