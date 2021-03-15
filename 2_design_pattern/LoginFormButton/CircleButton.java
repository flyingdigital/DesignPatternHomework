package com.flyingdigital.ds2_1;

public class CircleButton extends AbstractButton {
	public CircleButton(){
		super("圆形");
	}
	public void display() {
		System.out.println("设置按钮为"+super.getName());
	}
}
