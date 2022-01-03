package com.example.student.Controller;

import com.example.student.Bean.Student;
import com.example.student.Bean.User;
import com.example.student.Service.StudentService;
import com.example.student.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @CrossOrigin
    @RequestMapping("getAllUser")
    public List<Student> getAllUser(){
        return userService.getAllUser();
    }

    @CrossOrigin
    @RequestMapping("Hello2")
    public String Hello(){
        return "hello";
    }

    @CrossOrigin
    @RequestMapping("insertUser")//@RequestParam("DW") String DW
    public String insertUser(@RequestParam("account") String account,@RequestParam("password") String password ){
        System.out.println(account+"dsf");
        User user = new User("Z1807003347","男");
        User user2 = new User(account,password);
        userService.AddUser(user2);
        return "1";
    }

    @CrossOrigin
    @RequestMapping("UpdateUser")//@RequestParam("DW") String DW
    public void UpdateUser(@RequestParam("iduser") String iduser,@RequestParam("account") String account,@RequestParam("password") String password){

        User user = new User("Z1807003347","男");
        User user2 = new User(iduser,account,password);
        userService.UpdateUser(user2);
    }

    @CrossOrigin
    @RequestMapping("DelUser")//@RequestParam("DW") String DW
    public void DelUser(@RequestParam("id") String id){
        userService.DelUser(id);
    }

    @CrossOrigin
    @RequestMapping("getUserById")//@RequestParam("DW") String DW
    public List<Student>  getUserById(@RequestParam("id") String id){
        System.out.println(id);
        return userService.getUserById(id);
    }
    @CrossOrigin
    @RequestMapping("getUserByAccount")//@RequestParam("DW") String DW
    public List<Student>  getUserByAccount(@RequestParam("sid") String sid){

        return userService.getUserByAccount(sid);
    }
}
