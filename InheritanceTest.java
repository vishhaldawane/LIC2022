
public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandFather gf = new GrandFather();
		gf.farming();
		gf.farming(2022);
		gf.farming("Nagpur");
		
		System.out.println("----------");
		
		Father fa = new Father();
		fa.farming();//it is invoking super class's method
		fa.banking();
		
		System.out.println("----------");
		
		Child ch = new Child();
		ch.farming(); // it is invoking super's super class' method
		ch.banking();
		ch.javaCoding();
		
	}

}

class GrandFather
{
	GrandFather() {
		System.out.println("GrandFather() no argument... ctor..");
	}
	GrandFather(int i) {
		System.out.println("GrandFather(int)  argument... ctor..");

	}
	GrandFather(int i, String str) {
		System.out.println("GrandFather(int,String)  argument... ctor..");

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


class Father extends GrandFather //acquiring all the properties of its parent
{
	Father() {
		//super(); // to invoke the ctor of the super class
		System.out.println("\tFather() no argument... ctor..");
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
	Child() {
		//super();
		System.out.println("\t\tChild() no argument... ctor..");
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





