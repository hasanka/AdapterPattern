package api;

public class WildTerkey implements Terkey{

	@Override
	public void fly() {
		System.out.println("I'm Terkkey and flying above the earth.");
	}

	@Override
	public void gobble() {
		System.out.println("I'm Terkey and I can gobble");
	}

}
