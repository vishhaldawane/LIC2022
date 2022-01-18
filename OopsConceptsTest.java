
public class OopsConceptsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atm  myAtm = new Atm();
		myAtm.showTotalHits();
		myAtm.hitAtm();
		myAtm.hitAtm();
		myAtm.hitAtm();
		myAtm.hitAtm();
		myAtm.showTotalHits();
		
	}

}

class Atm
{
	private int numberOfUsersHit=1992;
	
	void showTotalHits() {
		System.out.println("Total users hit "+numberOfUsersHit);
	}
	
	void hitAtm() {
		System.out.println("Customer is accessing the ATM...");
		numberOfUsersHit++;
	}
}
/*


			OOPS Concepts
			
			Object Oriented Programming System
			
			
			1. Abstraction
					- hiding the complexity of an object
					- providing its simplicity by simple accessible functions
					
			2. Encapsulation
					- binding of data(by keeping it private)
					 	with the relevant function
					
			3. Polymorphism
					ability of an entity to have multiple forms
					
					- function overloading
							can be done on the following points
							a. type of argumnet 
							b. number of arguments
							c. sequence of types of arguments
							
					- operator overloading
						one operator multiple task
						
						- in java a developer cannot
						perform this
					
		
			4. Inheritance
				ability of a class to acquire properties
				from existing classes
				
				
				
				Constructor function
				-----------------------
		1		it has the same name as of the enclosing class
				
		2		it does not have return type / value
				
		3		but it can take parameters, hence they can be overloaded
				
		4		by default every class comes with a default/implicit constructor
				
		5		although one can write explicit constructor to do special things
				
		6		you can have either explicit or implicit, but not both
				
		7		IT IS CALLED DURING THE OBJECT CREATION PROCESS
				
		8		HENCE IT CAN BE USED TO INITIALIZE THE OBJECT'S DATA
				
				IT IS CALLED ONCE PER OBJECT
				
				
				
				
				
				
				
			
			5. Object communication
			
			
*/