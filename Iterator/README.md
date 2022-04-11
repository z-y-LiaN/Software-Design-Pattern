#目录结构
<img src="https://i.bmp.ovh/imgs/2022/04/10/3def41655a370abf.png" style="zoom: 50%;" />
## 具体类
- MenuItem.java
  - 菜单项类,定义了菜单里每一个菜单项的名字、价格、描述 等等
  
- DinerMenu.java
  - Diner的菜单，一个菜单存储许多菜单项
  - 采用数组的方式存储

- PancakeHouseMenu.java
  - PancakeHouse的菜单，一个菜单存储许多菜单项
  - 采用ArrayList的方式存储

---
## 迭代器相关类
- Iterator.java
  - 定义迭代器接口,包含hasNext(),next()方法

- DinerMenuIterator.java
  - 实现一个具体的迭代器接口，这个迭代器处理的是数组

- PancakeHouseMenuIterator.java
  - 实现一个具体的迭代器接口，这个迭代器处理的是ArrayList

---
## 客户类
- Waitress.java
  - 使用迭代器,打印(遍历)DinerMenu和PancakeHouseMenu中所有的菜单项

---
## 其他
- Test.java 测试类
- ImproveIterator文件
  - 采用java.util中的Iterator
  - 将 waitress与  DinerMenu和PancakeHouseMenu 解耦
- AddCafe文件夹
  - 在ImproveIterator的基础上添加一个新的CafeMenu
  - CafeMenu采用Hash表存储菜单项