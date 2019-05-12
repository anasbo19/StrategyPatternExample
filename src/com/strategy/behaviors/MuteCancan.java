package com.strategy.behaviors;

public class MuteCancan implements CancanBehavior {

	@Override
	public void cancan() {
		System.out.println("silence !");
	}

}
