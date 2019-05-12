package com.strategy.entities;

import com.strategy.behaviors.CancanBehavior;
import com.strategy.behaviors.FlyBehavior;

public abstract class Duck {

	FlyBehavior flyBehavior;
	CancanBehavior cancanBehavior;
	
	public void effectuerCancan() {
		cancanBehavior.cancan();
	}
	
	public void effectuerVol() {
		flyBehavior.fly();
	}

	public void swim() {
		System.out.println("i'm floating");
	}
	
	public abstract void show();
	
	public FlyBehavior getComportementVol() {
		return flyBehavior;
	}

	public void setComportementVol(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public CancanBehavior getComportementCancan() {
		return cancanBehavior;
	}

	public void setComportementCancan(CancanBehavior cancanBehavior) {
		this.cancanBehavior = cancanBehavior;
	}
	
	
}
