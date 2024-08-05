package com.t2208e.JAVA_EAD.service;

import com.t2208e.JAVA_EAD.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentById(int id);
    Student saveStudent(Student student);
    void deleteStudent(int id);
}
