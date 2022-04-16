package Observer.Score;
import java.util.List;

//分数的统计
//班级均分和最高最低分、班级分数段统计）
public final class ScoreProcess {
    //获取学生分数
    public static void getStudentScore(List<Score> scores,String studentID){
        for(Score item:scores){
            if(item.studentID.equals(studentID)){
                System.out.println("该学生的分数为:"+item.score);
            }
        }
    }

    //班级平均分 
    public static void getAverageScore(List<Score> scores){
        double sum=0;
        for(Score item:scores) sum+=item.score;
        double averageScore=sum/scores.size();
        System.out.println("班级的平均分数为："+averageScore);
    }

    //班级最高分
    public static void getMaxScore(List<Score> scores){
        double maxScore=0;
        for(Score item:scores) 
            maxScore = Math.max(maxScore, item.score);
        System.out.println("班级的最高分数为："+maxScore);
        
    }
    //班级最低分
    public static void getMinScore(List<Score> scores){
        double minScore=100+1;
        for(Score item:scores) 
            minScore = Math.min(minScore, item.score);
        System.out.println("班级的最低分数为："+minScore);
        
    }
    //班级分数段统计
    public static void getClassified(List<Score> scores){
        int GPA_4=0,GPA_3=0,GPA_2=0,GPA_1=0,GPA_0=0;
        for(Score item:scores){
            double temp=item.score;
            if(temp>=90) GPA_4++;
            else if(temp>=80) GPA_3++;
            else if(temp>=70) GPA_2++;
            else if(temp>=60) GPA_1++;
            else GPA_0++;
        }
        System.out.println("该班级的分数段统计如下");
        System.out.println("GPA = 4 的学生人数为："+GPA_4);
        System.out.println("GPA = 3 的学生人数为："+GPA_3);
        System.out.println("GPA = 2 的学生人数为："+GPA_2);
        System.out.println("GPA = 1 的学生人数为："+GPA_1);
        System.out.println("GPA = 0 的学生人数为："+GPA_0);

    }
}
