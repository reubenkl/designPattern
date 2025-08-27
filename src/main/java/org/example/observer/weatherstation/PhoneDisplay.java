package org.example.observer.weatherstation;

public class PhoneDisplay implements IObserver{

  private WeatherStation station;
  public PhoneDisplay(WeatherStation station) {
    this.station = station;
  }
  @Override
  public void update() {
    System.out.println("Phone Display - Temperature:"+station.getTemperature());
  }
}
