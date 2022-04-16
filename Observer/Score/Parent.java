package Observer.Score;
import java.util.*;
public class Parent implements Observer {
    private String studentID;
    public Parent(String studentID){
        this.studentID=studentID;
    }
    public void update(List<Score> scores){ 
        System.out.println("孩子学号为："+studentID+" 的家长获取到的分数信息如下:");
        ScoreProcess.getClassified(scores);
        ScoreProcess.getStudentScore(scores,studentID);
        System.out.println("***************END**************");
        System.out.println();
    }
}
