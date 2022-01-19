
public class AbstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	Animal animal = new Animal();//Cannot instantiate the type Animal
		
		Animal animal; //ref to Animal is possible 
		
		Dog d = new Dog(7);
		
		
		d.live();
		d.breathing();
		d.die();
		d.bark();
		d.giveBirth();
		

		Turtle turt = new Turtle(225);
		turt.live();
		turt.breathing();
		turt.die();
		turt.layEggs();
		
	}

}
// pacakges
//exception handling
//multithreading
//generics
//collection
//file handling
//jdbc

abstract class Animal // made for inheritance to the child 
{
    int age;
	
	Animal(int age) {
		this.age = age;
		System.out.println("Animal ctor...");
	}
	abstract void live(); //mandate on the child to implement this method
	abstract void die(); //mandate on the child to implement this method
	abstract void breathing();//mandate on the child to implement this method

	// incomplete function!!! whats the use of such function 
	//such functionalities are fulfilled by the immediate non-abstract child class
}

abstract class Mammal extends Animal { //mandate of Mammal + Animal
	Mammal(int age) {
		super(age);
	}
	void foo() { } // this function may not be overridden by the child
	abstract void giveBirth(); //this would be a mandate over Mammal's implementation
}
abstract class Reptile extends Animal { // mandate of Reptile + Animal
	Reptile(int age) {
		super(age);
	}
	abstract void layEggs();//this would be a mandate over Reptile's implementation
}

//The type Dog must implement the inherited abstract method Animal.die()
//The type Dog must implement the inherited abstract method Animal.breathing()
//The type Dog must implement the inherited abstract method Animal.live()
//The type Dog must implement the inherited abstract method Mammal.giveBirth()
class Dog extends Mammal //Mammal
{

	 //hanging in the air 
	
	 Dog(int age) {
		super(age);
	
	 }
	 void giveBirth() {
		 System.out.println("Dog is giving birth to puppies");
	 }
	 
	 void breathing() { //symmetrical function from Animal
		 System.out.println("Dog is breathing at a faster rate....");
	 }
	 void die() {
		 System.out.println("Dog is dieing max age is 14....");
	 }
	 void live() {
		 System.out.println("Dog is living happily..at the age : "+age);
	 }
	 void bark() { //exclusive...
		 System.out.println("Dod is barking....");
	 }
	 
}
//Person Student Employee 
class Turtle extends Reptile //Turtle is a Reptile community<-- Testudines
{
	
	 Turtle(int age) {
		super(age);
	 }

	 void breathing() {//symmetrical function from Animal
		 System.out.println("Turtle is breathing at a slower rate....");
	 }
	 void live() {
		 System.out.println("Tutrle is living in the ocean....");
	 }
	 void die() {
		 System.out.println("Turtle is dieing at the age of "+age);
	 }
	 void layEggs() {
		 System.out.println("Turtle is laying eggs...in the spawning ground..");
	 }
}
//is there any animal known as animal - it is abstract

/*
 
abstract drawings <-- by some artist
			|
	------------------------------
	|		|		|		|
	forest	ghost	cloud	face <-- different meanings can be percieved


				abstract
	
	field		NA
	
	method		incomplete method/ method without code body/ partial contract
				of a class
				abstract method must reside in an abstract class
				
	
	class		cannot be instantiated
				it is not compulsory to mention abstract function in it
		
			Unicorn <-- FlyingHorse	
				
				
										LivingBeing
										
						Animal <-- abstract parent				Tree
						|
	------------------------------------------------
	|			|			|			     |
	Fish		Mammal		Reptile		   Bird <-- abstract children of abstract parent
	|			|			|			     |
--------	---------	-------------	-----------
|	   |	|		|	|			|		|	|
Sword Whale	Dog	 Person	Turtle   Crocodile	Bat	Parrot <-- concrete classes
					|
					Student
					|
					Employee
					|
					Executive ... .. ..
					
					
interfaces = it is a pure abstract class
			it cannot have non-abstract functions
			by default every function is of type public abstract
			
	interface 
		
					
		Names ending with ing are supposed to be interfaces
		innovate function for them
		
		put them in relevant packages
		
		isolate all teh relevant interfaces, abstract classes, normal
		classes in a particular package 
		
		
		earth
		
		earth.species
		
		earth.species.water
		earth.species.land <-- packages
				
		
					earth
						|
			  Living	Breathing  Dying		
				|live	|breath();	 |die();
				+--------------------+
					  |
					  species
					  |
					  -----------------------------------------
					  |										 |
					Animal <-- abstract parent				Tree <-- as per your imagination develop this 
						|									 |
	-----------------------------------------------		-------------
	|			|			|				 |			|	|	|	|
	water		land		waterland		sky
	|			|			 |				 |
	Fish		Mammal		Reptile		   Bird <-- abstract children of abstract parent
	|			|	 Talking   | 			     |
--------	----------+	|   -------------	------------------------
|       |   |         | |   |           |       |                 |
|	    |	| Barking |	|   | Crawling	|		| Hanging Flying  | Diving
| Swim- |   | |       | |   |  |     |  |		| |       | |	  |   |
|  ming |   | |       | |   |  |     |  |       | +-------+ |	  |	  |
|	| | |   | |       | |   |  |     |  |       | |         |	  |	  |
Sword Whale	Dog	   Person	Turtle   Crocodile	Bat	    Parrot   Penguin<-- concrete classes
					|  Studying
					|   |
					Student
					|     Working
					|     |
					Employee
					|
					| Executing
					|   |
					Executive ... .. ..					
					
		Derivation			vs		Implementation
		
		
		
		
					
					
*/