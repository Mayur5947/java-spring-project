package com.stl.practice.repository;

import com.stl.practice.model.Student;
import com.stl.practice.service.ConnectionService;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class StudentRepository {
    public void insertStudent(Student student) throws SQLException {
        Connection connection = ConnectionService.getConnection();
        PreparedStatement statement = null;

        statement = connection.prepareStatement("insert into student values (?,?,?,?)");
        statement.setInt(1, student.getId());
        statement.setString(2, student.getName());
        statement.setString(4, student.getAddress());
        statement.setInt(3, student.getMarks());
        statement.executeUpdate();
        connection.close();
    }

    public void removeStudent(int id) throws SQLException {
        Connection connection = ConnectionService.getConnection();
        PreparedStatement statement = null;
        statement = connection.prepareStatement("delete from student where student_id = ?");
        statement.setInt(1, id);
        statement.executeUpdate();
        connection.close();
    }

    public void updateStudent(Student student) throws SQLException {
        Connection connection = ConnectionService.getConnection();
        PreparedStatement statement = null;

        statement = connection.prepareStatement("udpate student set name = ? , marks = ? , address = ? where student_id= ?");
        statement.setString(1, student.getName());
        statement.setInt(2, student.getMarks());
        statement.setString(3, student.getAddress());
        statement.setInt(4, student.getId());
        statement.executeUpdate();
        connection.close();
    }

    public void getStudent(int id) throws SQLException {
        Connection connection = ConnectionService.getConnection();
        PreparedStatement statement = connection.prepareStatement("select * from student where student_id = ?");
        statement.setInt(1, id);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            System.out.println(" id : " + resultSet.getInt(1));
            System.out.println(" name : " + resultSet.getString(2));
            System.out.println(" marks : " + resultSet.getInt(3));
            System.out.println(" address : " + resultSet.getString(4));
        }
        connection.close();
    }

    public void getAllStudent() throws SQLException {
        Connection connection = ConnectionService.getConnection();
        PreparedStatement statement = connection.prepareStatement("select * from student where student_id = ?");
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            System.out.println(" id : " + resultSet.getInt(1));
            System.out.println(" name : " + resultSet.getString(2));
            System.out.println(" marks : " + resultSet.getInt(3));
            System.out.println(" address : " + resultSet.getString(4));
        }
        connection.close();
    }


}
