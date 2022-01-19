
public class FinalTest {
	public static void main(String[] args) {
		//local variable must be initialized before its first use
		final float PI; //it should be a ready only variable
		PI=3.14f;
		System.out.println("PI "+PI);

		
		System.out.println("PI "+PI);

//The final local variable PI cannot be assigned. 
//It must be blank and not using a compound assignment
		//PI=3.18f;
		//System.out.println("PI "+PI);
		
//A super class reference type can point to its child class object
//but that reference can only use super class specific functionalities
//		Cricketer sachin = new Batsman();
//		
//		int score =  sachin.hitSixer();
//		System.out.println("score "+score);
//		
//		Batsman sachin1 = new Batsman();
		
		Doctor d = new Doctor();
		d.diagnose();
	//	d.doSurgery();
		
		System.out.println("----");
		
		Surgeon s = new Surgeon();
		s.diagnose();
		s.doSurgery();
	//	s.doHeartSurgery();
		System.out.println("----");
		
		HeartSurgeon hs = new HeartSurgeon();
		hs.diagnose();
		hs.doSurgery();
		hs.doHeartSurgery();
		
		System.out.println("================");
	
		Doctor refDoct = new Doctor();
		refDoct.diagnose();
		
		refDoct = new Surgeon();
		refDoct.diagnose();//can invoke overridden token
	//	refDoct.doSurgery(); //cannot refer exclusive token
		
		refDoct = new HeartSurgeon();
		refDoct.diagnose();
	//	refDoct.doSurgery();
	//	refDoct.doHeartSurgery();
	}
}

class Cricketer //Pooja has developed 
{
	int hitSixer() {
		System.out.println("hitting sixer....");
		return 6;
	}
}
class Batsman extends Cricketer { // Rakesh 
	int hitSixer() {//Cannot override the final method from Cricketer
		System.out.println("hitting sixer....150 meters");
		return 7;
	}
}

/*					final		
 * 
 *		field/		cannot be 
 *		variable	changed/modified
 *
 *		method/		cannot be 
 *		function	overriden
 *
 *		class		cannot be
 *					extended
 *
 * 
 * 
 * 
 * 
*/


class Doctor //generalization 
{
	void diagnose() {
		System.out.println("Doctor : diagnosing...EENTT");
	}
	final void takeOath() {
		System.out.println("Oath...Taking care of the patient...");
	}
}

class Surgeon extends Doctor //specialization
{
	void diagnose() { //overriding
		//super.diagnose();
		System.out.println("Surgeon : diagnosing...CT scan");
	}
	void doSurgery() { //overriding
		System.out.println("Surgeon: doing surgery....");
	}
//	void takeOath() {
//		System.out.println("Oath...Taking care of the patient..by charging than the usual...");
//	}
}
final class HeartSurgeon extends Surgeon //specialization
{
	void diagnose() {//overriding
		//super.diagnose();
		System.out.println("HeartSurgeon : diagnosing...ECG scan");
	}
	void doSurgery() { //overriding
		System.out.println("HeartSurgeon: doing surgery....");
	}
	void doHeartSurgery() {
		System.out.println("HeartSurgeon : doing heart surgery....");
	}
//	void takeOath() {
//		System.out.println("Oath...Taking care of the patient.by suggesting unnecessary angioplasty ..");
//	}
}

//The type DentalSurgeon cannot subclass the final class HeartSurgeon
class DentalSurgeon extends HeartSurgeon
{
	
}
