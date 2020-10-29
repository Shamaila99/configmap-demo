package com.example.configmap.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {

  private final ConfigProperties configProperties;

  @GetMapping("/data")
  public String getConfigMap(){
    return "hello " + configProperties.getText();
  }
}
