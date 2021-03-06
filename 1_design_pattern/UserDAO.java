package com.flyingdigital.ds1;

public class UserDAO {
	private DBUtil dbu;
	
	public UserDAO(DBUtil dbu) {
		this.dbu=dbu;
	}
	
	public boolean findUser(String userName,String userPasswd) {
		if(userName == "" || userName==null)
		{
			System.out.println("用户名不存在");
			return false;
		}
		
//		此处A，B 为数据库查找到的用户名密码
		if(userName=="A" && userPasswd=="B") {
			System.out.println("用户名密码匹配");
			return true;
		}
		else {
			System.out.println("用户名或密码错误");
			return false;
		}
	}
}
