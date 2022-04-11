package Iterator;

public class Test {
    public static void main(String[]args){
        //创建菜单
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        //创建服务员
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        
        //打印菜单
        waitress.printMenu();
    }
}
