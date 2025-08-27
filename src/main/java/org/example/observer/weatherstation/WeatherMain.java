package org.example.observer.weatherstation;

public class WeatherMain {
  public static void main(String[] args) {
    WeatherStation station = new WeatherStation();
    PhoneDisplay phoneDisplay = new PhoneDisplay(station);
    LaptopDisplay laptopDisplay = new LaptopDisplay(station);

    station.add(phoneDisplay);
    station.add(laptopDisplay);

    station.notifyObservers();
  }
}
