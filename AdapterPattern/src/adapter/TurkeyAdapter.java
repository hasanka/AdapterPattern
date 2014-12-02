package adapter;

import api.Duck;
import api.Terkey;

public class TurkeyAdapter implements Duck {

	private Terkey terkey;

	private TurkeyAdapter() {
	}

	public TurkeyAdapter(Terkey terkey) {
		this();
		this.terkey = terkey;
	}

	@Override
	public void fly() {
		System.out.println("Adapter Duck \n");
		terkey.fly();
	}

	@Override
	public void makeSound() {
		System.out.println("Adapter Duck \n");
		terkey.gobble();
	}

}
