package com.cgty.typecasting.classtype;

public class TestAnimal {

	public static void main(String[] args) {
		Animal a1 = new Animal();
				a1.eat();
		System.out.println("-----------------");	
		
		Dog d1 = new Dog();
		d1.eat();
		d1.walk();
		System.out.println("-----------------");
		
		Lion l1 = new Lion();
		l1.eat();
		l1.run();
		System.out.println("-----------------");
		
		Animal a2 = new Dog();
		a2.eat();
		System.out.println("-----------------");
		
		Dog d2 = (Dog) a2;
		d2.eat();
		d2.walk();
		System.out.println("-----------------");
		
		Animal a3 = new Lion();
		a3.eat();
		System.out.println("-----------------");
		
		Lion l2 = (Lion) a3;
		l2.eat();
		l2.run();
		
	}
	
}
