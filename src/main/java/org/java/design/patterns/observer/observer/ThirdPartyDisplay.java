package org.java.design.patterns.observer.observer;

import org.java.design.patterns.observer.observable.WeatherStation;

public class ThirdPartyDisplay implements IObserver, IDisplayElement {

    private WeatherStation weatherStation;

    public ThirdPartyDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.registerObserver(this);
    }

    @Override
    public void display() {

    }

    @Override
    public void update() {

    }
}
