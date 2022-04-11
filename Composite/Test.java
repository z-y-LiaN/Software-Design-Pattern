package Composite;

public class Test {
    public static void main(String[] args) {
        //先处理下所有菜单的创建
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");
        
        //一个最顶层的菜单
        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
       
       //使用组合的方式，将菜单添加到allMenus中
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        //在一个菜单里面添加菜单项
        dinerMenu.add(new MenuItem(
            "Pasta", 
            "Spaghetti with Marinara Sauce, and a slice of sourdough bread", 
            true, 
            3.89));

        //再一个菜单里面加入另一个子菜单
        dinerMenu.add(dessertMenu);

        //在子菜单中添加菜单项
        dessertMenu.add(new MenuItem("Apple Pie", "Apple pie with a flakey crust, topped with vanilla icecream", true, 1.59));
        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
