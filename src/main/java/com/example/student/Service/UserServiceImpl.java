package com.example.student.Service;

import com.example.student.Bean.Student;
import com.example.student.Bean.User;
import com.example.student.Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<Student> getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public void AddUser(User user) {
        userMapper.AddUser(user);

    }

    @Override
    public void UpdateUser(User user) {
        userMapper.UpdateUser(user);

    }

    @Override
    public void DelUser(String iduser) {
        userMapper.DelUser(iduser);
    }

    @Override
    public List<Student> getUserById(String iduser) {
        return userMapper.getUserById(iduser);
    }

    @Override
    public List<Student> getUserByAccount(String Account) {
        return userMapper.getUserByAccount(Account);
    }
}
