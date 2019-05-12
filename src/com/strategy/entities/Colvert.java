package com.strategy.entities;

import com.strategy.behaviors.Cancan;
import com.strategy.behaviors.FlyWithWings;

public class Colvert extends Duck {
	
	public Colvert() {
		cancanBehavior = new Cancan();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void show() {
		System.out.println("i'm a real Colvert");
	}

}
