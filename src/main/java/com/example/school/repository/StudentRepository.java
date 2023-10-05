// Write your code here
package com.example.school.repository;

import com.example.school.model.Student;

import java.util.*;

public interface StudentRepository {
    public ArrayList<Student> getAllStudents();

    public Student getStudentById(int studentId);

    public Student addStudent(Student student);

    public Student updateStudent(int studentId, Student student);

    public void deleteStudent(int studentId);
}