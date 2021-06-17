package com.flyingdigital.Pen;

import com.flyingdigital.Color.Color;

public abstract class Pen {
    Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw(String name);
}
