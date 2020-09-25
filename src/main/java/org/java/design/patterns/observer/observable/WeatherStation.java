package org.java.design.patterns.observer.observable;

import lombok.Getter;
import lombok.Setter;
import org.java.design.patterns.observer.observer.IObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable {
    @Getter
    @Setter
    private float temperature;
    @Getter
    @Setter
    private float humidity;
    @Getter
    @Setter
    private float pressure;
    private List<IObserver> observers;

    public WeatherStation() {
        observers = new ArrayList<>();
    }
    @Override
    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    /**
     * This incorporates the design principle encapsulate what varies
     * Here the more number of observers are the variables part of the code which
     * would lead us to modify this class whenever a new observer is added. But since
     * we have extracted it to an interface, we can easily add it even during runtime
     * and there is no need to modify this class every time.
      */
    @Override
    public void notifyObserver() {
        for (IObserver observer:observers) {
            observer.update();
        }
    }

    public void setMeasurement(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        measurementChanged();
    }

    private void measurementChanged() {
        notifyObserver();
    }
}
