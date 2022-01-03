package com.example.student.Service;

import com.example.student.Bean.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudent();
    void AddStudent(Student student);
    void UpdateStudent(Student student);
    void DelStudent(String ID);
    List<Student> getStudentById(String ID);
    List<Student> getStudentByStudentId(String ID);

}
