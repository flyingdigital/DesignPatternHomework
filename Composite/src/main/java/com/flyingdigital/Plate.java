package com.flyingdigital;

import java.util.ArrayList;

public class Plate extends Element {
    private ArrayList<Element> arrayList = new ArrayList<Element>();

    public void addElement(Element element){
        arrayList.add(element);
    }

    public void removeElement(Element element){
        arrayList.remove(element);
    }
    @Override
    public void eat() {
        for(Element element:arrayList){
            element.eat();
        }
    }
}
