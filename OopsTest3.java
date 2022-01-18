/*
 * 
 * 
 * 	Class					vs					Object
 * 	|											|		
 *  design of your object					instance of a class
 *  logical									physical
 *  blue print of a house					the actual house(s)
 *  doenst occupy memory					it would occupy the memory
 *  
 * 
 * 
 * Below line is interpreted as per the following diagram
 * 
 * 	Person p1 = new Person();
 *  Person p2 = new Person();
 *  Person p3 = new Person();
 *  
 *  Multiple object = multiple time data structure - to uniquely defining the objects
 *  but the member function are loaded only once.
 * 
 * 			stack							heap
 * 
 * 									gender	age		name		adress
 * 									-----------------------------------------
 * 									|	M	| 22	|Jack		|Mumbai		|
 * 									-----------------------------------------
 * 			+----------------------->100
 * 			|
 *			100 
 * 			p1
 * 
 *	 p1.showPerson();
 *   p2.showPerson();
 *   p3.showPerson();
 * 												METHOD AREA:
 * 											setPerson(g,a,n,addr);
 * 											changeAge(newAge) { }
 * 											changeName(newName) { }
 * 											changeAddress(newAddr) { }
 * 											showPerson() { }
 * 
 * 									gender	age		name		adress
 * 									-----------------------------------------
 * 									|	F	| 24	|Julie		|Pune	|
 * 									-----------------------------------------
 * 			+----------------------->200
 * 			|
 *			200 
 * 			p2
 * 
 * 
 * 									gender	age		name		adress
 * 									-----------------------------------------
 * 									|	M	| 28	|Robert		|Delhi		|
 * 									-----------------------------------------
 * 			+----------------------->300
 * 			|
 *			300 
 * 			p3
 * 
 * 	
 */

public class OopsTest3 {
	public static void main(String[] args) { 	
		Person p1 = new Person();	
		Person p2 = new Person();
		Person p3 = new Person();		
		p1.setPerson('M', 22, "Jack","Mumbai");	
		p1.printPerson();	
		
		p2.setPerson('F', 24, "Julie","Pune");	
		p2.printPerson();	
		
		p3.setPerson('M', 28, "Robert","Delhi"); 
		p3.printPerson();
		
	/*	p1.changeAddress("Chennai");
		p1.printPerson();
		
		p1.changeAge(23);
		p1.printPerson();
		
		p1.changeName("Jacky");
		p1.printPerson();
	*/
		
		
	}
}
class Person { // DATA + METHODS BOUND TOGETHER 
	char   gender; 
	int    age;	
	String name;	
	String address;
	
	void changeAddress(String newAddress) {
		System.out.println("Changing the address .....");
		address = newAddress;
	}
	void changeName(String newName) {
		System.out.println("Changing the name .....");
		name = newName;
	}
	void changeAge(int newAge) {
		System.out.println("Changing the age .....");
		age = newAge;
	}
	
	//MEMBER METHOD SECTION
	void setPerson(char g, int a, String n, String addr) { //2
		System.out.println("setPerson(char,int,String)...");
		gender = g;		
		age = a;	
		name = n;	
		address = addr;
	}
    void printPerson() { //1
		System.out.println("gender  is "+gender);
		System.out.println("age     is "+age);
		System.out.println("name    is "+name);
		System.out.println("address is "+address);
		System.out.println("-------------");	
	}	
}





