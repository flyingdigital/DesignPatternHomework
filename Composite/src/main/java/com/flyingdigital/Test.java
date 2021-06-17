package com.flyingdigital;

public class Test {
    public static void main(String[] args) {
        Element apple1,apple2,apple3,banana1,banana2,pear1,pear2;
        Plate plate1,plate2,plate3;

        // 第一个盘中放香蕉苹果
        apple1 = new Apple();
        banana1 = new Banana();
        plate1 = new Plate();
        plate1.addElement(apple1);
        plate1.addElement(banana1);

        // 第二个盘子放香蕉苹果梨子
        apple2 = new Apple();
        banana2 = new Banana();
        pear1 = new Pear();
        plate2 = new Plate();
        plate2.addElement(apple2);
        plate2.addElement(banana2);
        plate2.addElement(pear1);

        // 第三个盘子放苹果梨子和前两个盘子
        apple3 = new Apple();
        pear2 = new Pear();
        plate3 = new Plate();
        plate3.addElement(apple3);
        plate3.addElement(pear2);
        plate3.addElement(plate1);
        plate3.addElement(plate2);

        plate3.eat();

    }
}
