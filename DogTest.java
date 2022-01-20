
public class DogTest {
	public static void main(String[] args) {
		System.out.println("Begin main");
		// new keyword performs the allocation of data structure ie name,age
		try
		{
			Dog dog1 = new Dog("Bruno",-22);
			dog1.show();
		}
		catch(RuntimeException e) {
			System.out.println("Problem 1 being handled : "+e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Problem 2 being handled : "+e.getMessage());
		}
		System.out.println("End main");
		
	}
}
//class DogAgeExceededException   extends RuntimeException { }
//class DogAgeInNegativeException extends RuntimeException { }


class Dog
{
	private String name;
	private int age;
	
	Dog(String name, int age) {
		System.out.println("=>Dog(String,int) constructor...started..");
		this.name = name;
		if(age > 14 ) {
			//System.out.println("Dogs age cannot exceed 14 years...");
			RuntimeException rte = new RuntimeException("Dogs age cannot exceed 14 years...");
			throw rte; // throwing this object towards the invoker of this ctor.	
		}
		if(age <= 0 ) {
			RuntimeException rte = new RuntimeException("Dogs age cannot be in negative or zero..");
			throw rte; // throwing this object towards the invoker of this ctor.	
		}
		else {
			System.out.println("Setting the age as "+age);
			this.age = age;
		}
		System.out.println("=>Dog(String,int) constructor...over..");

	}
	
	void show() {
		System.out.println("hi "+name+" your age is "+age);
	}
}
