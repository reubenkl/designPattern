package org.example.strategyPattern.Payment;

public class CreditCardPayment implements PaymentStrategy{

  @Override
  public void pay(double amount) {
    System.out.println("Payment Done through Credit card:"+amount);
  }
}
