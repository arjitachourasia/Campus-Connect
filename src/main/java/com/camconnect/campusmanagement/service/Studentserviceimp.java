package com.camconnect.campusmanagement.service;
import com.camconnect.campusmanagement.model.Student;
import com.camconnect.campusmanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Studentserviceimp implements Studentservice{
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllstudents() {
        return studentRepository.findAll();
    }
}
