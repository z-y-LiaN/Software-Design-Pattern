package Iterator.AddCafe;

public class Test {
    public static void main(String[]args){
        PancakeHouseMenu pancakeHouseMenu=new PancakeHouseMenu();
        DinerMenu dinerMenu=new DinerMenu();
        CafeMenu cafeMenu=new CafeMenu();

        Waitress waitress=new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
        waitress.printMenu();
    }
}
