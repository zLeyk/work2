package com.example.student.Mapper;

import com.example.student.Bean.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StudentMapper {

    List<Student> getAllStudent();



}
