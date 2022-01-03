package com.example.student.Mapper;

import com.example.student.Bean.Student;
import com.example.student.Bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    List<Student> getAllUser();
    void AddUser(User user);
    void UpdateUser(User user);
    void DelUser(String iduser);
    List<Student> getUserById(String iduser);
    List<Student> getUserByAccount(String Account);



}
