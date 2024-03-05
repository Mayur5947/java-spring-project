package com.stl.practice.example;

import com.stl.practice.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws SQLException {
        ApplicationContext context =  new ClassPathXmlApplicationContext("spring.xml");
        StudentService service =  context.getBean("studentService",StudentService.class);
        service.insertStudent();

    }
}
