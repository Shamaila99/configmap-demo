package com.example.configmap.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MyBean {

  @Autowired
  private ConfigProperties config;

  @Scheduled(fixedDelay = 5000)
  public void hello() {
    log.info("The message is: " + config.getText());
  }
}