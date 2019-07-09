package ru.projects.edu.spring.task3.service.testing;

import org.springframework.stereotype.Service;
import ru.projects.edu.spring.task3.domain.Question;

import java.util.function.Predicate;

@Service
public class ValidateService implements Predicate<Question> {

  @Override
  public boolean test(Question question) {
    String inputText = question.getInputText();
    return inputText!=null && !inputText.isEmpty() && inputText.equalsIgnoreCase(question.getAnswer());
  }
}
