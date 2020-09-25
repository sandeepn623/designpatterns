package org.java.design.patterns.observer.observer;

import org.java.design.patterns.observer.observable.WeatherStation;

public class StatisticsDisplay implements IObserver, IDisplayElement {

    private WeatherStation weatherStation;
    private float[] temperatures;
    private int previousUpdatedTempIndex = 0;
    public StatisticsDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        temperatures = new float[2];
        weatherStation.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("avg: " + (temperatures[0] + temperatures[1])/2);
    }

    @Override
    public void update() {
        if(previousUpdatedTempIndex > 1) previousUpdatedTempIndex = 0;
        temperatures[previousUpdatedTempIndex] = weatherStation.getTemperature();
        previousUpdatedTempIndex++;
        display();
    }
}
