package Iterator.ImproveIterator;

public class MenuItem {
    //菜单项名称、叙述、是否为素食、价格
    String name;
    String description;
    boolean vegetarian;
    double price;
    //初始化菜单项
    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }
    //获取菜单信息
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public double getPrice() {
        return price;
    }
    public boolean isVegetarian() {
        return vegetarian;
    }
    
}
