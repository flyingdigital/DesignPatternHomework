package com.flyingdigital;

import com.flyingdigital.Color.Color;
import com.flyingdigital.Color.Red;
import com.flyingdigital.Pen.MidPen;
import com.flyingdigital.Pen.Pen;

public class Test {
    public static void main(String[] args) {
        Pen pen = new MidPen();
        Color color = new Red();

        pen.setColor(color);
        pen.draw("嗨嗨");
    }
}
