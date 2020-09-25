package org.java.design.patterns.observer.observer;


import org.java.design.patterns.observer.observable.WeatherStation;

public class CurrentConditions implements IObserver, IDisplayElement{

    // Here we favour composition ovwer inheritence to interact with the oÓbservable to
    // pull the data from it.

    private WeatherStation weatherStation;
    private float temperature;
    private float humidity;

    public CurrentConditions(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current Conditions: " + temperature + "F degrees and "
                + humidity + " % humidity");
    }

    @Override
    public void update() {
        this.temperature = weatherStation.getTemperature();
        this.humidity = weatherStation.getHumidity();
        display();
    }
}
