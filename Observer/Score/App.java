package Observer.Score;
import java.util.*;
/**
 * 某学校考试系统的用户包括教师、学生、家长。
 * 一门考试结束自动评分，分数发布出来后，
 * 教师会收到自己班级所有学生的分数及相关统计数据（包括班级均分和最高最低分、班级分数段统计）；
 * 家长会收到自己孩子分数及班级分数段统计；
 * 孩子会收到自己的分数。使用合适的设计模式，编程实现。
 */
public class App {
    public static void main(String[] args) throws Exception {
        ScoresSubject scoresSubject=new ScoresSubject();

        Teacher teacher=new Teacher();
        Student student=new Student("919106840212");
        Parent parent=new Parent("919106840212");
        
        scoresSubject.registerObserver(teacher);
        scoresSubject.registerObserver(parent);
        scoresSubject.registerObserver(student);

        
    
        List<Score> scores=new ArrayList<>();
        Score score=new Score("919106840212",90.0);
        scores.add(score);
        score=new Score("9191068409999",88.0);
        scores.add(score);
        score=new Score("9191068408888",68.0);
        scores.add(score);
        score=new Score("919106840234",100.0);
        scores.add(score);
        score=new Score("9191068401111",50.0);
        scores.add(score);
        score=new Score("9191068402222",70.0);
        scores.add(score);
        scoresSubject.setScores(scores);
        scoresSubject.notifyObservers();
    }
}
