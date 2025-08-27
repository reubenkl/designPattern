package org.example.observer.emailsubscriber;

public interface Observer {

  public static Observer createSubscriber(String name) {
    return (message) -> System.out.println(name + " received:"+ message);
  }
  void update(String message);
}
