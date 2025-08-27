package org.example.strategyPattern.Payment;

public class ShoppingCart {
  private PaymentStrategy paymentStrategy;

  public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
    this.paymentStrategy = paymentStrategy;
  }

  public void checkout(double amount){
    paymentStrategy.pay(amount);
  }
}
