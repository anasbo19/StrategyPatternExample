package com.strategy.behaviors;

public class DontFly implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("i can't fly");
	}

}
