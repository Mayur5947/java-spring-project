package com.stl.practice.repository;

import com.stl.practice.model.Student;
import com.stl.practice.service.ConnectionService;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Repository
public class StudentRepository {
    public void insertStudent(Student student) throws SQLException {
        Connection connection = ConnectionService.getConnection();
        PreparedStatement statement = null;

            statement = connection.prepareStatement("insert into student values (?,?,?,?)");
        statement.setInt(1,student.getId());
        statement.setString(2,student.getName());
        statement.setString(4,student.getAddress());
        statement.setInt(3,student.getMarks());
        statement.executeUpdate();
        connection.close();
    }
}
