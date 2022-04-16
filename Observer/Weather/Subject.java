package Observer.Weather;

public interface Subject {
    // 注册 删除观察者
    public void registerObserver(Observer o);
    public  void removeObserver(Observer o);

    // 当subject状态改变时，通知所有观察者
    public void notifyObservers();
}
