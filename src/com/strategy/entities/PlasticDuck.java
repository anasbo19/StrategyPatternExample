package com.strategy.entities;

import com.strategy.behaviors.DontFly;
import com.strategy.behaviors.MuteCancan;

public class PlasticDuck extends Duck {

	public PlasticDuck() {
		cancanBehavior = new MuteCancan();
		flyBehavior = new DontFly();
	}

	@Override
	public void show() {
		System.out.println("i am a plastic duck");
	}

}
