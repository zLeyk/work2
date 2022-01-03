package com.example.student.Controller;

import com.example.student.Bean.Student;
import com.example.student.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @CrossOrigin
    @RequestMapping("Hello")
    public String Hello(){
        return "hello";
    }

    @CrossOrigin
    @RequestMapping("Login")
    public int Login(@RequestParam("id") String ID,@RequestParam("password") String password )
            {
        if(ID=="admin"&&password=="123456")
            return 1;
        else
            return 0;
    }

    @CrossOrigin
    @RequestMapping("insertStudent")//@RequestParam("DW") String DW
    public String insetStudent(@RequestParam("studentID") String studentID,@RequestParam("gender") String gender,@RequestParam("major") String major,@RequestParam("politicalStatus") String politicalStatus
            ,@RequestParam("researchDirection") String researchDirection,@RequestParam("employmentIntentionRegion") String employmentIntentionRegion,@RequestParam("employmentIntentionUnit") String employmentIntentionUnit
            ,@RequestParam("internshipPlan") String internshipPlan,@RequestParam("employmentType") String employmentType,@RequestParam("employmentUnit") String employmentUnit,@RequestParam("location") String location){
        System.out.println(studentID+"dsf");
        Student student = new Student("Z1807003347","男","34","","共青团员","图形图像处理","不限","大厂", "否","","博观智能","");
        Student student2 = new Student(studentID, gender,"", major, politicalStatus, researchDirection,employmentIntentionRegion, employmentIntentionUnit, internshipPlan, employmentType, employmentUnit, location);
        studentService.AddStudent(student2);
        return "1";
    }

    @CrossOrigin
    @RequestMapping("updateStudent")//@RequestParam("DW") String DW
    public void UpdateStudent(@RequestParam("id") String ID,@RequestParam("studentID") String studentID,@RequestParam("gender") String gender,@RequestParam("major") String major,@RequestParam("politicalStatus") String politicalStatus
            ,@RequestParam("researchDirection") String researchDirection,@RequestParam("employmentIntentionRegion") String employmentIntentionRegion,@RequestParam("employmentIntentionUnit") String employmentIntentionUnit
            ,@RequestParam("internshipPlan") String internshipPlan,@RequestParam("employmentType") String employmentType,@RequestParam("employmentUnit") String employmentUnit,@RequestParam("location") String location){

        Student student = new Student("235","Z1807003347","v","34","","共青团员","图形图像处理","不限","大厂", "否","","博观智能","");
        Student student2 = new Student(ID,studentID, gender,"", major, politicalStatus, researchDirection,employmentIntentionRegion, employmentIntentionUnit, internshipPlan, employmentType, employmentUnit, location);
        studentService.UpdateStudent(student2);
    }

    @CrossOrigin
    @RequestMapping("delStudent")//@RequestParam("DW") String DW
    public void StudentStudent(@RequestParam("id") String id){
        studentService.DelStudent(id);
    }

    @CrossOrigin
    @RequestMapping("getStudentById")//@RequestParam("DW") String DW
    public List<Student>  getStudentById(@RequestParam("id") String id){

        return studentService.getStudentById(id);
    }
    @CrossOrigin
    @RequestMapping("getStudentByStudentId")//@RequestParam("DW") String DW
    public List<Student>  getStudentByStudentId(@RequestParam("sid") String sid){

        return studentService.getStudentByStudentId(sid);
    }
}
