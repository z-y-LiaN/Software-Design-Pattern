package Observer.Weather;

public interface Observer {
    // 当subject状态改变时，subject会把这些状态值传递给观察者
    // 所有的观察者都必须实现这个方法
    public void update(float temp, float humidity, float pressure);
}
