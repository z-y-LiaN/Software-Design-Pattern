package Observer.WeatherUseUtil;

import java.util.Observable;

public class WeatherData extends Observable{
    private float temperature;
    private float humidity;
    private float pressure;

    // 构造器不再需要为记住观察者们而建立数据结构
    public WeatherData() {
    }

    public void measurementsChanged() {
        // 在通知之前，先说明状态已经改变
        setChanged();
        // 这里没有调用notiftyObservers()传送对象
        // 采用“ 拉 ”的方式
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
