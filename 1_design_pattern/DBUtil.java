package com.flyingdigital.ds1;


public class DBUtil {
	private String dbName;
	
	public DBUtil(String dbName) {
		this.dbName = dbName;
		getConnection(dbName);
	}
	
	public void getConnection(String dbName) {
		System.out.println("数据库: " + dbName +  "  已连接");
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}
	
	
}
