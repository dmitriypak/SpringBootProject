package ru.projects.edu.spring.task3.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import ru.projects.edu.spring.task3.dao.StudentDao;
import ru.projects.edu.spring.task3.service.resourceload.LoadService;
import ru.projects.edu.spring.task3.service.student.StudentService;
import ru.projects.edu.spring.task3.service.testing.TestService;

import java.io.IOException;

@Service
public class AppLauncher implements CommandLineRunner {
  private final LoadService loadService;
  private final StudentService studentService;
  private final TestService testService;
  private final StudentDao studentDao;

  public AppLauncher(LoadService loadService, TestService testService, StudentService studentService, StudentDao studentDao) throws IOException {
    this.loadService = loadService;
    this.testService = testService;
    this.studentService = studentService;
    this.studentDao = studentDao;
  }

  public void start() throws IOException {
    if(studentService.registerStudent() && loadService.loadTest()){
      testService.start(studentDao.getStudent());
    }
  }

  @Override
  public void run(String... args) throws Exception {
    this.start();
  }
}
