package org.example.strategyPattern.Payment;

public class NetBanking implements PaymentStrategy{
  @Override
  public void pay(double amount) {
    System.out.println("Payment done thorugh Netbanking:"+amount);
  }
}
