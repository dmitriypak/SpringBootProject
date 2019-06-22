package ru.projects.edu.spring.task3.service.resourceload;

import java.io.IOException;
import java.util.Map;

public interface LoadService {
  boolean loadTest() throws IOException;
  Map<Integer,String>getQuestions();
  Map<Integer,String>getAnswers();
}
