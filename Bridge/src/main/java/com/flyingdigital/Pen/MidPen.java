package com.flyingdigital.Pen;

public class MidPen extends Pen {
    @Override
    public void draw(String name) {
        System.out.print("中等大小毛笔绘制");
        color.bePainted(name);
    }
}
