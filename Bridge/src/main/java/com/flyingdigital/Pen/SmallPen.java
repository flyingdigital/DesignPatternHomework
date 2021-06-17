package com.flyingdigital.Pen;

public class SmallPen extends Pen {

    @Override
    public void draw(String name) {
        System.out.print("小号毛笔绘制");
        color.bePainted(name);
    }
}
