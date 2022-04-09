package Template.xmlExample;

public abstract class DataViewer {
    //模板方法
    public void Process() {
        getData();
        if(isNotXMLData()){
            convertToXML();
        }
        displayData();   
    }

    //抽象方法：（1）从数据源获取数据;因为支持多种源数据，所以是抽象方法
    public abstract void getData();

    //具体方法：（2）将数据转换为xml格式：所有的图标操作都基于xml格式的数据，所以是具体方法
    public final void convertToXML(){
        //获取数据
        getData();
        //转换为xml格式
        System.out.println("Convert to xml");
    }
    //抽象方法：（3）以某种图表方式显示XML格式的数据
    public abstract void displayData();

    //因为如果从数据源获取的数据已经是xml则无需就行转换

    public boolean isNotXMLData(){
        return true;
    }
}
