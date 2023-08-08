package com.student.management.service;

import com.student.management.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Integer id);

    Student updateStudent(Student student);

    void deleteStudentById(Integer id);

}
