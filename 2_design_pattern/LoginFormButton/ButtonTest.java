package com.flyingdigital.ds2_1;

public class ButtonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		AbstractButton btn = new RectangleButton();
//		LoginForm form = new LoginForm(btn);
//		form.display(btn);
		
		AbstractButton btn = new TriangleButton();
		LoginForm form = new LoginForm(btn);
		form.display(btn);
	}

}
