
public class DogTest {
	public static void main(String[] args) {
		System.out.println("Begin main");
		// new keyword performs the allocation of data structure ie name,age
		try
		{
			Dog dog1 = new Dog("Bruno",5);
			dog1.show();
			dog1.roam();
		}
		catch(DogAgeExceededException e) {
			System.out.println("Problem 1 being handled : "+e.getMessage());
		}
		catch(DogAgeInNegativeException e) {
			System.out.println("Problem 2 being handled : "+e.getMessage());
		}
		catch(BarkingException b) {
			System.out.println("Problem 3 being handled : "+b.getMessage()+" what happened...why r u barking....????");
		}
		System.out.println("End main");
		
	}
}

//InsufficientFundsException - withdraw()
//AccountNotFoundException - while seaching an account
//DepositExceedIncomeTaxException - while depositing more than the income tax level
//PayeeNotFoundException - while fund transfer



/*
  unchecked type need not be mentioned in the throws clause of the Dog's
  constructor or any method 
  
class DogAgeExceededException   extends RuntimeException { //isA - unchecked
	DogAgeExceededException(String msg) {
		super(msg);
	}
}
class DogAgeInNegativeException extends RuntimeException { //isA - unchecked
	DogAgeInNegativeException(String msg) {
		super(msg);
	}
}
*/

// checked type must be mentioned in the throws clause of the Dog's
// constructor or any method 

class DogAgeExceededException   extends Exception { //isA - checked
	DogAgeExceededException(String msg) {
		super(msg);
	}
}
class DogAgeInNegativeException extends Exception { //isA - checked
	DogAgeInNegativeException(String msg) {
		super(msg);
	}
}

class BarkingException extends RuntimeException { //isA  - unchecked
	BarkingException(String str) {
		super(str);
	}
}

class Dog
{
	private String name;
	private int age;
	
	Dog(String name, int age) throws DogAgeExceededException, DogAgeInNegativeException 
	{
		System.out.println("=>Dog(String,int) constructor...started..");
		this.name = name;
		if(age > 14 ) {
			//System.out.println("Dogs age cannot exceed 14 years...");
			//RuntimeException rte = new RuntimeException("Dogs age cannot exceed 14 years...");
			DogAgeExceededException dogAgeExceedEx = new DogAgeExceededException("Dogs age cannot exceed 14 years...");
			throw dogAgeExceedEx; // throwing this object towards the invoker of this ctor.	
		}
		if(age <= 0 ) {
			
			//RuntimeException rte = new RuntimeException("Dogs age cannot be in negative or zero..");
			DogAgeInNegativeException dogAgeNegativeEx = new DogAgeInNegativeException("Dogs age cannot be in negative or zero..");
			throw dogAgeNegativeEx; // throwing this object towards the invoker of this ctor.	
		}
		else {
			System.out.println("Setting the age as "+age);
			this.age = age;
		}
		System.out.println("=>Dog(String,int) constructor...over..");

	}
	
	void roam() 
	{
		for(int i=1;i<=15;i++) {
			System.out.println(name+" Dog is roaming..."+i+" minute over...");
			double value = Math.random(); // generate number from 0.0 to 1.0
			if(value >0.75 && value < 0.80) {
				BarkingException barkEx = new BarkingException("Dog is barking...bhu bhu bho..bho.");
				throw barkEx;
			}
		}
	}
	void show() {
		System.out.println("hi "+name+" your age is "+age);
	}
}
