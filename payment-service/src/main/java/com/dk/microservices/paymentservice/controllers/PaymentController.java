package com.dk.microservices.paymentservice.controllers;


import com.dk.microservices.paymentservice.bean.PaymentConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

  @Autowired
  private PaymentConfiguration paymentConfiguration;


  @GetMapping("/paymentMethod")
  public PaymentConfiguration getPaymentConfiguration() {
    return new PaymentConfiguration(paymentConfiguration.getPaymentMethod());
  }

}
