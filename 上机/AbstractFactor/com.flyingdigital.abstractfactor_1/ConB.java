package com.flyingdigital.abstractfactor_1;

public class ConB implements BFactor {
	public Fruit createFruit() {
		return new Banana();
	}
	public Vegetables createVegetable() {
		return new Tomato();
	}
}
