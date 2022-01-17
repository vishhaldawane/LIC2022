/*
 	Follow the naming convention - it is not mandatory
 	but it advised to use it 
 	
 	ClassName - Employee, DriverManager, MakeMyTrip
 	variables - rollNumber,  socialSecurityNumber
 	functions - withdraw(), setLookAndFeel()
 	CONSTANT  - PI, MAX, MIN, SPEED_OF_LIGHT
 	packages  - java.lang, java.awt, jungle.tree
 */
public class DataTypeTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to data types");
		
		byte rollNumber = 50; //camelCase	
		System.out.println("roll number is : "+rollNumber);
		System.out.println("Min value is   : "+Byte.MIN_VALUE);
		System.out.println("Max value is   : "+Byte.MAX_VALUE);
		System.out.println("------------");

		short accountNumber=3276;
		System.out.println("account number  : "+accountNumber);
		System.out.println("Short Min value : "+Short.MIN_VALUE);
		System.out.println("Short Max value : "+Short.MAX_VALUE);
		System.out.println("------------");
		
		int policyNumber=123276;
		System.out.println("policy number  : "+accountNumber);
		System.out.println("Int Min value : "+Integer.MIN_VALUE);
		System.out.println("Int Max value : "+Integer.MAX_VALUE);
		System.out.println("------------");
		
		long socialSecurityNumber=322276;
		System.out.println("SS number       : "+socialSecurityNumber);
		System.out.println("Long Min value  : "+Long.MIN_VALUE);
		System.out.println("Long Max value  : "+Long.MAX_VALUE);
		System.out.println("------------");

		
		float rate=3.5f; // f to make it as float else it is double
		System.out.println("bank interest   : "+rate);
		System.out.println("Float Min value : "+Float.MIN_VALUE);
		System.out.println("Float Max value : "+Float.MAX_VALUE);
		System.out.println("------------");
		
		double molecularDistance=0.0443; // f to make it as float else it is double
		System.out.println("distance is      : "+molecularDistance);
		System.out.println("Double Min value : "+Double.MIN_VALUE);
		System.out.println("Double Max value : "+Double.MAX_VALUE);
		System.out.println("------------");
		
		char alphabet='E';//0 to 65534 letters - (256) ASCII + UNICODE 
		System.out.println("alphabet is      : "+alphabet);
		System.out.println("Char Min value   : "+Character.MIN_VALUE);
		System.out.println("Char Max value   : "+Character.MAX_VALUE);
		
		System.out.println(" char is "+(char)0);
		System.out.println(" char is "+(char)66);
		System.out.println(" char is "+(char)67);
		System.out.println(" char is "+(char)65534);
		
		System.out.println("------------");
		
		boolean gotMarried = true;
		System.out.println("got married      : "+gotMarried);

		System.out.println("------------");
		
		String myCity="New York";
		String yourCity = myCity;
		System.out.println("my   city is : "+myCity);
		System.out.println("your city is : "+yourCity);
	}
}


