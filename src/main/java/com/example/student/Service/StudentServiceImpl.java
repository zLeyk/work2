package com.example.student.Service;

import com.example.student.Bean.Student;
import com.example.student.Mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentMapper studentMapper;


    @Override
    public List<Student> getAllStudent() {
        return studentMapper.getAllStudent();
    }

    @Override
    public void AddStudent(Student student) {
        studentMapper.AddStudent(student);
    }

    @Override
    public void UpdateStudent(Student student) {
        studentMapper.UpdateStudent(student);
    }

    @Override
    public void DelStudent(String ID) {
        studentMapper.DelStudent(ID);

    }

    @Override
    public List<Student> getStudentById(String ID) {
        return studentMapper.getStudentById(ID);
    }

    @Override
    public List<Student> getStudentByStudentId(String ID) {
        return studentMapper.getStudentByStudentId(ID);
    }
}
