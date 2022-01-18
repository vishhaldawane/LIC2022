import java.time.LocalDate;

public class HasATest {
	public static void main(String[] args) {
		
		Person2 p1 = new Person2('F',22,"Reena");
		
		p1.passport.setPassportDetails("T123123", "Govt Of India", LocalDate.of(2020, 1, 10),LocalDate.of(2030, 1, 10) );
		p1.adhaar.setAdhaarCard("1234 1234 1234", "Indian Govt.", "West Avenue", "9820443464");
		p1.printPerson();
		
		Student s1 = new Student('F',33,"Pooja Aggarwal",123,"Bharati Vidyapeeth",90.5f,'A');
		s1.passport.setPassportDetails("T882288","Govt Of India", LocalDate.of(2015, 11, 10),LocalDate.of(2025, 11, 10));
		s1.adhaar.setAdhaarCard("9234 8234 7234", "Indian Govt.", "East Avenue", "8820113464");
		s1.printStudentDetails();
	}
}

class Passport
{
	String passportNumber;
	String issuedBy;
	LocalDate issuedOn;
	LocalDate expiryOn;
	
	void setPassportDetails(String pn, String ib, LocalDate io, LocalDate eo) {
			passportNumber  = pn;
			issuedBy = ib;
			issuedOn = io;
			expiryOn = eo;
	}
	
	void showPassportDetails() {
		System.out.println("---Passport Details---");
		System.out.println("Passport Number    : "+passportNumber);
		System.out.println("Passport Issued By : "+issuedBy);
		System.out.println("Passport Issued On : "+issuedOn);
		System.out.println("Passport Expiry On : "+expiryOn);
		System.out.println("----------------------------");
	}
	
}

class AdhaarCard
{
	String adhaarNumber;
	String issuedBy;
	String address;
	String phoneNumber;
	
	void setAdhaarCard(String an, String ib,String addr, String phone) {
		adhaarNumber  = an;
			issuedBy = ib;
			address = addr;
			phoneNumber = phone;
	}
	
	void showAdhaarCardDetails() {
		System.out.println("---Adhaar Details---");
		System.out.println("Adhaar Number      : "+adhaarNumber);
		System.out.println("Adhaar Issued By   : "+issuedBy);
		System.out.println("Adhaar Address     : "+address);
		System.out.println("Adhaar linked phone: "+phoneNumber);
		System.out.println("----------------------------");
	}
	
}


class Person2 // extends ......
{
	char gender;
	int  age;
	String name;
	Passport passport = new Passport(); //hasA
	AdhaarCard adhaar = new AdhaarCard(); //hasA
	
	
	Person2(char gender, int age, String name) {
		this.gender = gender;
		this.age    = age;
		this.name   = name;
	}
	
	void printPerson() {
		System.out.println("Gender : "+gender);
		System.out.println("Age    : "+age);
		System.out.println("Name   : "+name);
		passport.showPassportDetails();
		adhaar.showAdhaarCardDetails();
	}
}

//knowledge applied -> converted wisdom

class Student extends Person2 //isA
{
	//all super class fields are also created here, age, gender, name, passport, adhaar
	int rollNumber;
	String collegeName;
	float percentage;
	char grade;
	
	Student(char g, int a, String n, int roll, String co, float p, char gr) {
		super(g,a,n);
		rollNumber = roll;
		collegeName = co; 
		percentage = p;
		grade = gr;
	}
	void printStudentDetails() {
		super.printPerson();
		System.out.println("---Student Details ---");
		System.out.println("Roll Number  : "+rollNumber);
		System.out.println("College Name : "+collegeName);
		System.out.println("Percentage   : "+percentage);
		System.out.println("Grade        : "+grade);
		System.out.println("----------------------");
		
	}
	
}
/*

	
		LivingBeing
		|
		Animal
		|
		Mammal
		|
		Person
		|-->Passport passport
		|-->AdhaarCard adhaar
		|
		Student
		|isA
		|
		Employee
		|isA
		|
		Executive
		|isA
		|
		Manager
		|isA
		|
		Director
		
		Person isA Passport  X invalid 
		
		Person hasA Passport  YEs valid 
		

		WashingMachine hasA WashingTub
		
		Bulb hasA Filament
		
		Ovan hasA HeatingCoil
		

*/