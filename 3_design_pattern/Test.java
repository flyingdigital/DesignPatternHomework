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
	
		System.out.println("--组员添加的部分--");		
		Color green=new Green();	//组员添加的新颜色
		AbstractShape triangle=new Triangle(); //组员添加的三角形
		System.out.println("组员添加的形状-三角形");
		triangle.setColor(red);	
		triangle.draw();
		triangle.setColor(blue);
		triangle.draw();
		triangle.setColor(yellow);
		triangle.draw();
		triangle.setColor(green);
		triangle.draw();
		System.out.println("组员添加的颜色-绿色");
		rectangular.setColor(green);	//组员添加的绿色
		rectangular.draw();
		
	}

}
