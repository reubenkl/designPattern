package org.example.observer.weatherstation;

public class LaptopDisplay implements IObserver{

  private WeatherStation station;
  public LaptopDisplay(WeatherStation station) {
    this.station = station;
  }
  @Override
  public void update() {
    System.out.println("Laptop Display - Temperature:"+station.getTemperature());
  }
}
