package com.flyingdigital.ds2_3;

public class XMLTransformer extends AbstractTransformer {
	public void transformer(AbstractSource source) {
		source.getSource();
		System.out.println("将数据转换成XML");
	}
}
