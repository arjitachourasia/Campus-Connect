package com.camconnect.campusmanagement.service;

import com.camconnect.campusmanagement.model.Student;

import java.util.List;

public interface Studentservice {
    public Student saveStudent(Student student);
    public List<Student> getAllstudents();
}
