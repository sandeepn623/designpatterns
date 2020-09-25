package org.java.design.patterns.observer;

import org.java.design.patterns.observer.observable.WeatherStation;
import org.java.design.patterns.observer.observer.CurrentConditions;
import org.java.design.patterns.observer.observer.HeatIndexDisplay;
import org.java.design.patterns.observer.observer.StatisticsDisplay;
import org.junit.jupiter.api.Test;

public class TestObserverPattern {

    @Test
    public void test_current_conditions_display() {
        WeatherStation weatherStation = new WeatherStation();
        CurrentConditions currentConditions = new CurrentConditions(weatherStation);
        weatherStation.setMeasurement(80, 65, 30.4f);
        weatherStation.setMeasurement(82, 70, 29.2f);
        weatherStation.setMeasurement(78, 90, 29.2f);


    }

    @Test
    public void test_current_conditions_and_heat_index_display() {
        WeatherStation weatherStation = new WeatherStation();
        CurrentConditions currentConditions = new CurrentConditions(weatherStation);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherStation);
        weatherStation.setMeasurement(80, 65, 30.4f);
        weatherStation.setMeasurement(82, 70, 29.2f);
        weatherStation.setMeasurement(78, 90, 29.2f);


    }

    @Test
    public void test_current_conditions_and_hi_statistics_display() {
        WeatherStation weatherStation = new WeatherStation();
        CurrentConditions currentConditions = new CurrentConditions(weatherStation);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherStation);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherStation);
        weatherStation.setMeasurement(80, 65, 30.4f);
        weatherStation.setMeasurement(82, 70, 29.2f);
        weatherStation.setMeasurement(78, 90, 29.2f);


    }
}
