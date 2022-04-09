package Template;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook{

    //提供模板方法中的抽象方法的实现
    public void brew(){
        System.out.println("Dripping Coffee through filter");
    }
    public void addCondiments(){
        System.out.print("Adding Sugar and Milk");
    }

    //钩子方法，子类可以覆盖，提供了自己的功能
    //让用户输入他们对调料的决定
    public boolean customerWantsCondiments(){
        String answer = getUserInput();
        if(answer.toLowerCase().startsWith("y")){
            return true;
        }else{
            return false;
        }
    }

    //读取用户输入
    private String getUserInput(){
        String answer = null;
        System.out.println("Would you like milk and sugar with your coffee (y/n)?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try{
            answer = in.readLine();
        }catch(Exception e){
            System.out.println("IO error trying to read your answer");
        }
        if(answer == null){
            return "no";
        }
        return answer;
    }
    
}
