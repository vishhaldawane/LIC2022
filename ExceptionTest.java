import java.util.InputMismatchException;
import java.util.Scanner;

//writing robust application
//ability to survive in critical runtime errors

public class ExceptionTest {
	public static void main(String[] args) {
		
		System.out.println("Begin main");
		
		
		try 
		{ //business logic below 
			
			Scanner scan = new Scanner(System.in); //keyboard entry now
			
			System.out.println("Enter value for x : ");
			int x=scan.nextInt(); //expecting an integer value to be entered here
			System.out.println("x : "+x);
			
			System.out.println("Enter value for y : ");
			int y=scan.nextInt();
			System.out.println("y : "+y);
			
			int z=x / y; //if y is zero JVM does the following activity
							//1. it creates the object of ArithmeticException class
							// ArithmeticException e = new ArithmeticException("/ by zero");
							//2. then it throws object towards your java program
							// throw e;
							//3. if your java program fails to catch it
							// then it is rethrown back to JVM
							//4. JVM wont catch it, and will drop it by
							// terminating your application
			
			System.out.println("z : "+z);
		}
		catch(ArithmeticException e) // <-- error handling logic
		{ //error handling logic below
			System.out.println("Cannot divide by zero...");
		}
		catch(InputMismatchException e) {
			System.out.println("Please supply proper input....");
		}
		finally {
			System.out.println("Finally ... Runs regardless of the Exception ....");
		}
		
		System.out.println("End main");
		//but what if we have 15 such if conditions
		// in a program and want to trace the business
		//logic and error logic - tedious job
	}
}

/*
 

 	Exception = runtime error
 	
 	
 	
 	
 	
 	if(y!=0) { //business logic below 
			int z=x / y;
			System.out.println("z : "+z);
		}
		else { //error handling logic below
			System.out.println("Cannot divide by zero...");
		}
 
 
 */