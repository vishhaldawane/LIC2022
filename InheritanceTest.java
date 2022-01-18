
public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandFather gf = new GrandFather(80,"Ramchandra","Nagpur",50);
		gf.farming();
		gf.farming(2022);
		gf.farming("Nagpur");
		gf.printDetails();
		
		System.out.println("----------");
		
		Father fa = new Father(50,"Sharad","Pune",25, 75.0f);
		fa.farming();//it is invoking super class's method
		fa.banking();
		fa.printDetails();
		
		System.out.println("----------");
		
		Child ch = new Child(30,"Rocky","Mumbai",15,12,300);
		ch.farming(); // it is invoking super's super class' method
		ch.banking();
		ch.javaCoding();
		ch.printDetails();

		A a = new A();
		a.fun();
		
		B b = new B();
		b.fun();
		
	}
//saatbara 7/12 entries- Record of Rights
}

class GrandFather
{
	
	int age;
	String name;
	String address;
	int land;
	
	
	GrandFather() {
		System.out.println("GrandFather() no argument... ctor..");
	}
	GrandFather(int i) {
		System.out.println("GrandFather(int)  argument... ctor..");
	}
	GrandFather(int i, String n, String a, int l) {
		System.out.println("GrandFather(int,String,String,int)  argument... ctor..");
		age = i;
		name = n;
		address = a;
		land = l;
	}
	GrandFather(int i, String n, String a) {
		System.out.println("GrandFather(int,String,String,int)  argument... ctor..");
		age = i;
		name = n;
		address = a;
	}
	
	void printDetails() {
		System.out.println("Age     : "+age);
		System.out.println("Name    : "+name);
		System.out.println("Address : "+address);
		System.out.println("Land    : "+land+" acre");
	}
	
	void farming() {
		System.out.println("GrandFather is farming..using the bull and plough....");
	}
	
	void farming(String where) {
		System.out.println("GrandFather is farming...in "+where);

	}
	
	void farming(int  when) {
		System.out.println("GrandFather is farming...in "+when);

	}
}


//Father is the sub class
//GrandFather is the super class

//Sansaara  -  manifestation - expanding universe - 


class Father extends GrandFather //acquiring all the properties(data+function) of its parent
{
	float cashDeposit; // age name address land cashDeposit
	
	Father(int a, String n, String ad) {
		super(a,n,ad); // to invoke the ctor of the super class
		System.out.println("\tFather() no argument... ctor..");
	}
	
	Father(int a, String n, String ad,int landPart, float cash) {
		super(a,n,ad,landPart); // to invoke the ctor of the super class
		System.out.println("\tFather() no argument... ctor..");
		cashDeposit = cash;
	}
	
	void printDetails() {
		super.printDetails(); // super. function/data of super class
		System.out.println("Cash    : "+cashDeposit+" lakh");
		
	}
	
	//overriding - hiding the function of its parent class
	void farming() { // redefinition of the GrandFather's farming
		System.out.println("Father is farming...via tractor...");
	}
	
	void banking() {
		System.out.println("Father is banking...via manual way....");
	}
}


class Child extends Father   //acquiring all the properties of its parent
{
	float cryptoCurrency; // age name address land cashDeposit cryptoCurrency
	
	Child(int a, String n, String ad) {
		super(a,n,ad);
		System.out.println("\t\tChild(int,String,String) no argument... ctor..");
	}
	
	Child(int a, String n, String ad, float crypto) {
		super(a,n,ad);
		cryptoCurrency = crypto;
		System.out.println("\t\tChild(int,String,String,float) no argument... ctor..");
	}
	
	Child(int a, String n, String ad, int landPart, int cashPart, float crypto) {
		super(a,n,ad,landPart,cashPart);
		cryptoCurrency = crypto;
		System.out.println("\t\tChild(int,String,String,float) no argument... ctor..");
	}
	
	void printDetails() {
		super.printDetails(); // super. function/data of super class
		System.out.println("Crypto  : "+cryptoCurrency+" points");		
	}
	
	void farming() { // redefinition of the GrandFather's farming
		System.out.println("Child is farming...via robo drone and robo tractor...");
	}
	void banking() {
		System.out.println("Child is banking  via internet and mobile...");
	}
	void javaCoding() {
		System.out.println("Child is doing java coding..in mac os with eclipse....at night 12....");
	}
}

class A
{
	void fun() { }
}

class B 
{
	void fun() { } //this is not at all overriding
}





