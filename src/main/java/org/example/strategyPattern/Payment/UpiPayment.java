package org.example.strategyPattern.Payment;

public class UpiPayment implements PaymentStrategy{
  @Override
  public void pay(double amount) {
    System.out.println("Payment Done through UPI:"+amount);
  }
}
