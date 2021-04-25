package com.flyingdigital.abstractfactor_1;

public class ConA implements AFactor {
	public Fruit createFruit() {
		return new Apple();
	}
	public Vegetables createVegetable() {
		return new Cabbage();
	}
}
