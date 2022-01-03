package com.example.student.Service;

import com.example.student.Bean.Student;
import com.example.student.Bean.User;

import java.util.List;

public interface UserService {

    List<Student> getAllUser();
    void AddUser(User user);
    void UpdateUser(User user);
    void DelUser(String iduser);
    List<Student> getUserById(String iduser);
    List<Student> getUserByAccount(String Account);

}
