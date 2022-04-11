# 目录结构
<img src="https://i.bmp.ovh/imgs/2022/04/10/742898cea6ea5dda.png" style="zoom: 50%;" />

- Menu.java
  - 接口,只有创建迭代器的方法,相比之前的方式,其实就是把这个方法从原来的DinerMenu和PancakeHouseMenu中抽取出来

- DinerMenu.java
  - Diner的菜单类,实现了Menu接口

- DinerMenuIterator.java
  - Diner的菜单项是用数组存储的,数组无法直接使用Java.util中的Iterator,所以要重写迭代器类

- PancakeHouseMenu.java 
  - PancakeHouse的菜单类,实现了Menu接口

- Waitress.java
  - 客户类,由于上述两位都实现了Menu接口,Waiterss可以利用Menu从DinerMenu和PancakeHouseMenu中解耦
  - 从而使Waitress类依赖于抽象,而不是具体

- Test.java
  - 测试类