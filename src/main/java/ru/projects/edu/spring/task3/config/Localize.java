package ru.projects.edu.spring.task3.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@ConfigurationProperties("application")

public class Localize {
  private Locale locale;
  private String localization;

  public Localize(String localization) {
    this.locale = new Locale(localization);
  }

  public Locale getLocale() {
    return locale;
  }

  public void setLocale(Locale locale) {
    this.locale = locale;
  }
}
