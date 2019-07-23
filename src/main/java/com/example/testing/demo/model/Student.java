package com.example.testing.demo.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Value;
import org.springframework.data.annotation.Id;

@Data
@Builder
@EqualsAndHashCode
public class Student {

    @Id
    String rollNumber;
    String firstName;
    String lastName;
    int age;
    String recordIdentifier;
}
