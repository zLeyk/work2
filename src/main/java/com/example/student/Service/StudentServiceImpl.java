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
}
