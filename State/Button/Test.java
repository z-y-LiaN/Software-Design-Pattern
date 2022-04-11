package State.Button;
/**
 * @author zyl
 * @StudentID 919106840212
 * @date 2022年4月11日
 */
public class Test {
    public static void main(String[] args) {
        
        Switch s1=new Switch("1");
        Switch s2=new Switch("2");

        s1.turnOn();
        s1.getState();s2.getState();
        System.out.println("------------------------------");

        s2.turnOn();
        s1.getState();s2.getState();
        System.out.println("------------------------------");

        s1.turnOff();
        s1.getState();s2.getState();
        System.out.println("------------------------------");

        s2.turnOn();
        s1.getState();s2.getState();
        System.out.println("------------------------------");

    }
}
