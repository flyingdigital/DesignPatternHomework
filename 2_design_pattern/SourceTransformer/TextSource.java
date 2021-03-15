package com.flyingdigital.ds2_3;

public class TextSource extends AbstractSource {
	public void sourceName() {
		System.out.println("从文本获取数据");
	}
	public void openFile() {
		System.out.println("正在打开文件");
	}
	public void getSource() {
		openFile();
		System.out.println("获取文件数据");
	}
}
