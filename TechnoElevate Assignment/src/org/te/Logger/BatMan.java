package org.te.Logger;

public class BatMan implements JusticeLeague{

	@Override
	public void superPower() {
		System.out.println("the super power :super-rich");
		
	}

	@Override
	public void birthPlanet() {
		System.out.println("birth place :earth");
		
	}

	@Override
	public void details() {
		birthPlanet();
		superPower();
		
		
	}

	@Override
	public void fly() {
		System.out.println("BatMan is flying");
		
	}

	@Override
	public void hit() {
		System.out.println("Batman is throws gernade");
		
	}

}
