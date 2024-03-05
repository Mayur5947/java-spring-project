package com.stl.practice.service;

import com.stl.practice.model.Student;
import com.stl.practice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.Scanner;

@Service("studentService")
public class StudentService {

    @Autowired
    private Student student;
    @Autowired
    private StudentRepository repository;
    Scanner scanner =  new Scanner(System.in);
    public void insertStudent() throws SQLException {
        System.out.println("enter id");
        student.setId(scanner.nextInt());
        System.out.println("enter name");
        student.setName(scanner.next());
        System.out.println("enter marks");
        student.setMarks(scanner.nextInt());
        System.out.println("enter address");
        student.setAddress(scanner.next());
        repository.insertStudent(student);
    }

    public void removeStudent() throws SQLException {
        System.out.println(" enter id");
        int id = scanner.nextInt();
        repository.removeStudent(id);
    }
    public void updateStudent() throws SQLException {
        System.out.println("enter id");
        student.setId(scanner.nextInt());
        System.out.println("enter name");
        student.setName(scanner.next());
        System.out.println("enter marks");
        student.setMarks(scanner.nextInt());
        System.out.println("enter address");
        student.setAddress(scanner.next());
        repository.updateStudent(student);
    }
    public void getStudent() throws SQLException {
        System.out.println(" enter id");
        int id = scanner.nextInt();
        repository.getStudent(id);
    }
    public void getAllStudent() throws SQLException {
        repository.getAllStudent();
    }
}
