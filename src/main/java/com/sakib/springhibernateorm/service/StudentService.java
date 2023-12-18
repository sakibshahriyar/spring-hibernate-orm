package com.sakib.springhibernateorm.service;
import com.sakib.springhibernateorm.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentById(int id);
    void updateStudent(Student student);
    void deleteStudent(int id);
}
