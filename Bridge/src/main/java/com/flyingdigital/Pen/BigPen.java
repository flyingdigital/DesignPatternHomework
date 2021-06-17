package com.flyingdigital.Pen;

public class BigPen extends Pen {
    @Override
    public void draw(String name) {
        System.out.print( "大号毛笔绘制");
        color.bePainted(name);
    }
}
