package ru.projects.edu.spring.task3.dao;

import org.springframework.stereotype.Repository;
import ru.projects.edu.spring.task3.domain.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

  private Student student;

  @Override
  public Student getStudent() {
    return student;
  }

  @Override
  public void setStudent(Student student) {
    this.student = student;
  }
}
