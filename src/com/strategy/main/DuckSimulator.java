package com.strategy.main;

import com.strategy.behaviors.CoinCoin;
import com.strategy.behaviors.DontFly;
import com.strategy.entities.Colvert;
import com.strategy.entities.Duck;

public class DuckSimulator {


	public static void main(String[] args) {
		Duck colvert = new Colvert();
		colvert.swim();
		colvert.show();
		colvert.effectuerCancan();
		colvert.effectuerVol();
		colvert.setComportementCancan(new CoinCoin());
		colvert.setComportementVol(new DontFly());
		colvert.effectuerCancan();
		colvert.effectuerVol();
	}

}
