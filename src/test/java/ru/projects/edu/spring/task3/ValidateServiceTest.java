package ru.projects.edu.spring.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import ru.projects.edu.spring.task3.domain.Question;
import ru.projects.edu.spring.task3.service.testing.ValidateService;

import static org.mockito.BDDMockito.given;

@SpringBootTest
public class ValidateServiceTest {
  @MockBean
  Question question;
  @Autowired
  private ValidateService validateService;

  @Test
  void validateCorrectAnswerTest(){
    given(this.question.getAnswer()).willReturn("pass");
    given(this.question.getInputText()).willReturn("pass");
    Assertions.assertTrue(validateService.test(question));
  }

  @Test
  void validateNonCorrectAnswerTest(){
    given(this.question.getAnswer()).willReturn("noncorrect");
    given(this.question.getInputText()).willReturn("correct");
    Assertions.assertFalse(validateService.test(question));
  }

}
