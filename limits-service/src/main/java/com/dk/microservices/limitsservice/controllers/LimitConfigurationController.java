package com.dk.microservices.limitsservice.controllers;


import com.dk.microservices.limitsservice.bean.Configuration;
import com.dk.microservices.limitsservice.bean.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitConfigurationController {


  @Autowired
  private Configuration configuration;

  @GetMapping("/limits")
  public LimitConfiguration retrieveLimitConfiguration() {
    return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
  }
}
