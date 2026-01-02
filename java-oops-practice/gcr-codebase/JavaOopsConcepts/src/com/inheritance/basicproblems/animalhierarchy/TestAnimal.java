package com.inheritance.basicproblems.animalhierarchy;

public class TestAnimal {
	
	public static void main(String[] args)
	{
		Dog myDog = new Dog("Sheru" , 12);
		myDog.makeSound();
		
		Cat myCat = new Cat("Rio" , 4 );
		myCat.makeSound();
		
		Bird myBird = new Bird("Parrot", 7);
		myBird.makeSound();
	}

}
