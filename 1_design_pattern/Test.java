package com.flyingdigital.ds1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBUtil dbu = new DBUtil("Oracle");
		UserDAO dao = new UserDAO(dbu);
		LoginForm form = new LoginForm(dao);
		
//		假设获取到的用户名密码为 A B
		String userName = "A";
		String userPasswd = "B";
		form.setUserName(userName);
		form.setUserPasswd(userPasswd);
		
		form.validate();
	}

}
