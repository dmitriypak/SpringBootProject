package ru.projects.edu.spring.task3;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.MessageSource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import ru.projects.edu.spring.task3.config.AppLauncher;
import ru.projects.edu.spring.task3.config.Localize;
import ru.projects.edu.spring.task3.config.MessageServiceConfig;
import ru.projects.edu.spring.task3.dao.StudentDao;
import ru.projects.edu.spring.task3.dao.TestDao;
import ru.projects.edu.spring.task3.service.io.MessageService;
import ru.projects.edu.spring.task3.service.resourceload.ResourceLoadService;
import ru.projects.edu.spring.task3.service.student.StudentService;
import ru.projects.edu.spring.task3.service.testing.TestService;

import java.util.Locale;

import static org.mockito.BDDMockito.given;

@ExtendWith({SpringExtension.class, MockitoExtension.class})
@SpringBootTest
@ContextConfiguration(classes = {SpringBootProjectApplication.class, MessageServiceConfig.class,Localize.class})
class MessageServiceTest {


  @Autowired
  private MessageSource messageSource;

  @Mock
  private Localize localize;

  @Test
  void getMessageTest(){
    Assertions.assertEquals(messageSource.getMessage("family",null,localize.getLocale()),"Input Family");
  }
}
