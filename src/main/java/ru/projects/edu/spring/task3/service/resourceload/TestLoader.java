package ru.projects.edu.spring.task3.service.resourceload;

import ru.projects.edu.spring.task3.domain.Question;

import java.io.IOException;
import java.util.List;

public interface TestLoader {
  boolean loadTest() throws IOException;
  List<Question> getQuestions();
}
