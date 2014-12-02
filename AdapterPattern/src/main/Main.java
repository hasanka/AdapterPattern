package main;

import adapter.TurkeyAdapter;
import api.Duck;
import api.MallarDuck;
import api.Terkey;
import api.WildTerkey;

public class Main {

	public static void main(String[] args) {

		Duck d1 = new MallarDuck();
		Terkey t1 = new WildTerkey();

		Duck ad1 = new TurkeyAdapter(t1);
		
		System.out.println("################ Duck 01 ################");
		d1.fly();
		d1.makeSound();
		System.out.println("#########################################");
		
		System.out.println("################ Turkey 01 ################");
		t1.fly();
		t1.gobble();
		System.out.println("#########################################");
		
		System.out.println("################ Duck 02 ################");
		ad1.fly();
		ad1.makeSound();
		System.out.println("#########################################");
		
		
	}

}
