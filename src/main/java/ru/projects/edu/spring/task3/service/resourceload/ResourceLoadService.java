package ru.projects.edu.spring.task3.service.resourceload;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.AbstractFactoryBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;

@ConfigurationProperties("application")

public class ResourceLoadService extends AbstractFactoryBean<LoadService> implements ResourceLoaderAware {
  private ResourceLoader resourceLoader;
  private final String type;
  private final String path;

  public ResourceLoadService(String type, String path) {
    this.type = type;
    this.path = path;
  }

  public String getType() {
    return type;
  }

  public String getPath() {
    return path;
  }


  public void setResourceLoader(ResourceLoader resourceLoader) {
    this.resourceLoader = resourceLoader;
  }

  @Override
  public Class<?> getObjectType() {
    return LoadService.class;
  }

  @Override
  protected LoadService createInstance() throws Exception {
    switch (type.toLowerCase()){
      case "csv":{
        return new CSVReadServiceImpl(resourceLoader.getResource(path));
      }
      default:
        throw new UnsupportedOperationException();
    }
  }
}
