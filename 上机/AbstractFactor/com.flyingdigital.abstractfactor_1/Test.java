package com.flyingdigital.abstractfactor_1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConA a = new ConA();
		Fruit aFruit = a.createFruit();
		Vegetables aVegetables = a.createVegetable();
		
		System.out.println("A工厂产品");
		aFruit.eat();
		aVegetables.eat();
		
		ConB b = new ConB();
		Fruit bFruit = b.createFruit();
		Vegetables bVegetables = b.createVegetable();
		
		System.out.println("B工厂产品");
		bFruit.eat();
		bVegetables.eat();
	}

}
