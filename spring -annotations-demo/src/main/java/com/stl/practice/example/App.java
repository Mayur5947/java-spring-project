package com.stl.practice.example;

import com.stl.practice.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws SQLException {
        ApplicationContext context =  new ClassPathXmlApplicationContext("spring.xml");
        StudentService service =  context.getBean("studentService",StudentService.class);
        Scanner  scanner =  new Scanner(System.in);
        for(;;){
            System.out.println(" 1  add 2 remove 3 update 4 get student 5 get all student 6 stop");
            int choice = scanner.nextInt();

            switch (choice){
                case 1 :{
                    service.insertStudent();
                    break;
                }
                case 2 :{
                    service.removeStudent();
                    break;
                }
                case 3 :{
                    service.updateStudent();
                    break;
                }
                case 4 :{
                    service.getStudent();
                    break;
                }
                case 5 :{
                    service.getAllStudent();
                    break;
                }
                case 6 :{
                    service.insertStudent();
                    break;
                }
            }
        }

    }
}
