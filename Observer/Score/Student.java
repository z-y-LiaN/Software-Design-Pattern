package Observer.Score;
import java.util.*;
public class Student implements Observer{
    private String studentID;

    public Student(String studentID) {
        this.studentID = studentID;
    }

    @Override
    public void update(List<Score> scores) {
        System.out.println("学号为 "+studentID+" 的学生获取到的信息如下:");
        ScoreProcess.getStudentScore(scores,studentID);
        System.out.println("***************END**************");
        System.out.println();
    }
}