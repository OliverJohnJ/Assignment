package org.te.Logger;

public class SuperMan implements JusticeLeague{

	@Override
	public void superPower() {
		System.out.println("the sueperpower :Krypo-power");
		
	}

	@Override
	public void birthPlanet() {
	System.out.println("the birth place :kryton");
		
	}

	@Override
	public void details() {
		birthPlanet();
		superPower();
		
		
	}

	@Override
	public void fly() {
		System.out.println("super man is flying");	
	}

	@Override
	public void hit() {
		System.out.println("superman punching");
		
	}

}
