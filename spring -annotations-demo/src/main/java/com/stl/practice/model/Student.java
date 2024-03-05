package com.stl.practice.model;

import lombok.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
@ToString
public class Student {
    private String name;
    private int id;
    private int marks;
    private String address;
}
