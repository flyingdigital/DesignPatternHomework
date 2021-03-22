package com.flyingdigital.ds3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color red=new Red();
		AbstractShape rectangular=new Rectangular();
		rectangular.setColor(red);
		rectangular.draw();
		
		
		Color blue = new Blue();
		rectangular.setColor(blue);
		rectangular.draw();
		
		Color yellow = new Yellow();
		rectangular.setColor(yellow);
		rectangular.draw();
		
	}

}
