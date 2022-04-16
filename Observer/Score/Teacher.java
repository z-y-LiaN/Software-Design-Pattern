package Observer.Score;
// 教师会收到:
// 所有学生的分数scores 及 相关统计数据
//统计数据包括：（包括班级均分和最高最低分、班级分数段统计）；
import java.util.*;
public class Teacher implements Observer{
    
    public void  update(List<Score> scores){
        System.out.println("该老师获取到的分数信息如下:");
        ScoreProcess.getAverageScore(scores);
        ScoreProcess.getMaxScore(scores);
        ScoreProcess.getMinScore(scores);
        ScoreProcess.getClassified(scores);
        System.out.println("***************END**************");
        System.out.println();
    }
}
