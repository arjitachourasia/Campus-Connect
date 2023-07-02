package com.camconnect.campusmanagement.controller;

import com.camconnect.campusmanagement.model.Student;
import com.camconnect.campusmanagement.service.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Autowired
    private Studentservice studentservice;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentservice.saveStudent(student);
        return "New student is added";
    }

    @GetMapping("/getAll")
    public List<Student> getAllstudents(){
        return studentservice.getAllstudents();
    }
}
