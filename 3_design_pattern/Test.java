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
	
		System.out.println("--��Ա��ӵĲ���--");		
		Color green=new Green();	//��Ա��ӵ�����ɫ
		AbstractShape triangle=new Triangle(); //��Ա��ӵ�������
		System.out.println("��Ա��ӵ���״-������");
		triangle.setColor(red);	
		triangle.draw();
		triangle.setColor(blue);
		triangle.draw();
		triangle.setColor(yellow);
		triangle.draw();
		triangle.setColor(green);
		triangle.draw();
		System.out.println("��Ա��ӵ���ɫ-��ɫ");
		rectangular.setColor(green);	//��Ա��ӵ���ɫ
		rectangular.draw();
		
	}

}
