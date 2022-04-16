package Observer.Score;
import java.util.*;
public class ScoresSubject implements Subject {
    // 主题持有观察者的集合
    private List<Observer> observers;
    private List<Score> scores;

    public ScoresSubject() {
        observers=new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void setScores(List<Score> scores) {
        this.scores = scores;
    }
    
    public void notifyObservers() {
        for(Observer observer:observers){
            observer.update(scores);
        }
    }
}
