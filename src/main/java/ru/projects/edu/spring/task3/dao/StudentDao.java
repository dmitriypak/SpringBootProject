package ru.projects.edu.spring.task3.dao;

import ru.projects.edu.spring.task3.domain.Student;

public interface StudentDao {
  Student getStudent();
  void setStudent(Student student);
}
