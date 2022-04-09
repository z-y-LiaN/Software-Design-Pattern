package Template.xmlExample;
public class XMLDataViewer extends DataViewer{
    //实现父类方法：获取数据
    public void getData(){
        System.out.println("Get XML Data");
    }
    //实现父类方法：显示数据，并以柱状图显示
    public void displayData(){
        System.out.println("Display XML Data");
    }
    //覆盖父类的钩子方法
    //体现出钩子可以让子类实现算法中可选的部分
    public boolean isNotXMLData(){
        return false;
    }
}