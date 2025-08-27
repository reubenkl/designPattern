package org.example.observer.weatherstation;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable{

  private List<IObserver> observers = new ArrayList<>();

  private int temperature = 32;
  @Override
  public void add(IObserver observer) {
    this.observers.add(observer);
  }

  @Override
  public void remove(IObserver observer) {
    this.observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    for (IObserver observer : observers){
      observer.update();
    }
  }

  public int getTemperature() {
    return temperature;
  }
}
