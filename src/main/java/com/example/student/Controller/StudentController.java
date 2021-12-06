package com.example.student.Controller;

import com.example.student.Bean.Student;
import com.example.student.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @CrossOrigin
    @RequestMapping("getAllStudent")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }
}
