package Observer.Score;
import java.util.*;
public interface Observer{
    // 采用推的形式，主题向观察者发送数据
    public void update(List<Score> scores );
    
}