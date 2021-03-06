package com.flyingdigital.ds1;

public class LoginForm {
	private UserDAO dao;
	private	String userName;
	private String userPasswd;
	
	public LoginForm(UserDAO dao) {
		// TODO Auto-generated constructor stub
		this.dao = dao;
		init();
		display();
	}
	
	public void init() {
		System.out.println("初始化登录控件成功");
	}
	
	public void display() {
		System.out.println("成功增加控件并显示");
	}
	
	public void validate() {
		if(this.dao.findUser(userName, userPasswd)) {
			System.out.println("用户成功登录");
		}
		else {
			System.out.println("用户登录失败");
		}
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPasswd() {
		return userPasswd;
	}

	public void setUserPasswd(String userPasswd) {
		this.userPasswd = userPasswd;
	}
	
}
