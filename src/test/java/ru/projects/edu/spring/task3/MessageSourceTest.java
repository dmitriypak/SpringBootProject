package ru.projects.edu.spring.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.MessageSource;
import org.springframework.test.context.junit4.SpringRunner;
import ru.projects.edu.spring.task3.config.AppLauncher;
import ru.projects.edu.spring.task3.config.Localize;

import java.util.Locale;

import static org.mockito.BDDMockito.given;

@SpringBootTest
class MessageSourceTest {

  @Autowired
  private MessageSource messageSource;

  @Test
  void getMessageTest(){
    Assertions.assertEquals(messageSource.getMessage("family",null,new Locale("en")),"Input Family");
  }
}
