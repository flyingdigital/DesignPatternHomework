## 桥接模式-----将图形着色

### 期望达到的目的

有很多不同的形状(长方形，圆形，三角形，五角星等等)，还有很多不同的颜色(红，黄，蓝等等)，现在想给每一个图形图不同的颜色(可能只有一两中，如红色的长方形，蓝色的长方形)，设计类实现。

### 一般的想法

设计一个抽象图形类，具体的形状为抽象类子类(eg: AbstractShape----> Rectangular)，而不同的颜色再继承子类(eg: Rectangular----> RedRectangular)。

这样的设计不宜与添加一个新的类，比如有n种图形，m种颜色，添加一个图形，可能就会派生出m个类。同理，添加一个颜色，可能会派生出n个类。非常不宜与维护。

### 桥接模式

桥接模式大概的做法是(还是给图形着色问题)，还是给图形类设计一个抽象类(AbstractShape)，但是这个抽象类里有一个接口的成员变量( eg: protected Color color)。而针对颜色，做法是定义一个接口(Color)，再让不同的具体的类去实现这个接口(class Red implements Color)。这么做的好处在于我不必让具体的图形去实现这个接口，而是用一个实现类来代替，一个字，爽！

### 扩充类时的说明

- 添加一个图形。

  如果想添加一个新的图形，请让这个图形继承**AbstractShap**类。这个新的图形类需要实现**draw()**方法，方法里需要定义一个shapeName即添加图形的名字，接着调用父类color的接口方法(这个color需要自己手动set，即一个实现Color接口的具体类)。

  ```
  @Override
  public void draw() {
      String shapeName="长方形";
      super.color.paintShape(shapeName);
  
  }
  ```

  

- 添加一种颜色

  添加一种新颜色只需实现Color接口里的方法即可。

  ```
  @Override
  public void paintShape(String shapeName) {
  // TODO Auto-generated method stub
  	System.out.println("把"+shapeName+"画成黄色。");
  
  }
  	
  ```

- 如何调用

  ```
  Color red=new Red();
  AbstractShape rectangular=new Rectangular();
  rectangular.setColor(red);
  rectangular.draw();
  ```

  