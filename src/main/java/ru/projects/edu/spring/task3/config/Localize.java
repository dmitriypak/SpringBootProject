package ru.projects.edu.spring.task3.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import java.util.Locale;

@ConfigurationProperties("application")

public class Localize {
  private Locale locale;
  private String path;
  private String localization;

  public Localize(String localization, String path) {
    this.path = path;
    this.locale = new Locale(localization);
  }

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public Locale getLocale() {
    return locale;
  }

  public void setLocale(Locale locale) {
    this.locale = locale;
  }
}
