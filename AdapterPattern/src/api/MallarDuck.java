package api;

public class MallarDuck implements Duck {

	@Override
	public void fly() {
		System.out.println("I'm Duck and flying above the earth.");
	}

	@Override
	public void makeSound() {
		System.out.println("I'm Duck and I can quake.");
	}

}
