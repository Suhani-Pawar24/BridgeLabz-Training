package com.day4.petpal;

public class TestPet 
{

    public static void main(String[] args)
	{
        
        Dog myDog = new Dog("Buddy","Dog", 3);
        Cat myCat = new Cat("Rio","Sparrow", 1); 

        System.out.println("--- Welcome to PetPal ---");
        
       
        myDog.makeSound();
        myCat.makeSound();

        System.out.println("\n--- Interacting with Rio (The Bird) ---");
        myDog.displayStats();
        myDog.play();
        myDog.feed();
        myDog.displayStats();
        
        myCat.displayStats();
        myCat.sleep();
        myCat.displayStats();
    }
}


