package Observer.WeatherUseUtil;

import java.util.Observable;

public class Test {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionsDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(80f, 65f, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
