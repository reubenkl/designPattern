package org.example.strategyPattern.Payment;

public class PaymentMain {
  public static void main(String[] args) {
    ShoppingCart cart = new ShoppingCart();

    cart.setPaymentStrategy(new CreditCardPayment());
    cart.checkout(100);

    cart.setPaymentStrategy(new UpiPayment());
    cart.checkout(200);

    cart.setPaymentStrategy(new NetBanking());
    cart.checkout(500);
  }
}
