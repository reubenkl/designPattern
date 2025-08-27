package org.example.observer.emailsubscriber;

import java.util.ArrayList;
import java.util.List;

public class NewsPublisher {

  private List<Observer> observers = new ArrayList<>();

  public void add(Observer observer) {
    observers.add(observer);
  }

  public void remove(Observer observer) {
    observers.remove(observer);
  }

  public void publish(String message) {
    for(Observer observer: observers){
      observer.update(message);
    }
  }
}
