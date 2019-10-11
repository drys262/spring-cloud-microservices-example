package com.dk.microservices.paymentservice.bean;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("payment-service")
public class PaymentConfiguration {

  private String paymentMethod;

  protected PaymentConfiguration() {}

  public PaymentConfiguration(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }
}
