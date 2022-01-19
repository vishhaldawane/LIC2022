
public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child ch = new Child();
		ch.workInFarm();
		ch.bank();
		ch.code();
		ch.faceBookCheck();
		ch.checkWhatsapp();
		ch.talk();
		ch.breath();
		ch.live();
		ch.fightForFreedom();
		
	}

}


abstract class Animal2
{
	abstract void live();
	abstract void die();
	abstract void breath();
}
abstract class Mammal2 extends Animal2
{
	abstract void giveBirth();
	void fun() { //can have non-abstract function here
		
	}
}

abstract class Person extends Mammal2 {
	abstract void talk();
}
interface Farming {
	//void fun() { //interface cannot have non-abstract function
	//	
	//}
	void workInFarm(); // by default public  and abstract
}
interface FreedomFighting {
	void fightForFreedom(); // by default public  and abstract
}
//In java One class cannot extend from multiple classes
//but can inherit from multiple interafces [ pure abstract classes ]
/*
 * 			Animal
 * 			|isA
 * 			Mammal
 * 			|isA
 * 			Person Farming FreedomFighting
 * 			|		 |isA   |isA
 * 			|		 +------+
 * 			|isA     |
 * 			GrandFather <-- has received many mandates
 * 
 */
class GrandFather extends Person implements  Farming, FreedomFighting
{

	@Override
	public void fightForFreedom() {
		System.out.println("Grandfather is fighting for the freedom");
		
	}

	@Override
	public void workInFarm() {
		System.out.println("Grandfather is working in the farm...");
		
	}

	@Override
	void talk() {
		System.out.println("Grandfather is talking int the Village Justice ");
		
	}

	@Override
	void giveBirth() {
		System.out.println("Grandfather is giving birth .....");
		
	}

	@Override
	void live() {
		System.out.println("Grandfather is is living happily in the village...");
		
	}

	@Override
	void die() {
		System.out.println("Grandfather is dying at peace..");
		
	}

	@Override
	void breath() {
		System.out.println("Grandfather is breathing...at calm rate...");
		
	}
}

interface Banking {
	void bank();
}
interface Travelling {
	void travel();
}
class Father extends GrandFather implements Banking, Travelling
{

	@Override
	public void bank() {
		// TODO Auto-generated method stub
		
	}
	public void travel() {
		
	}
}

interface Coding {
	void code();
}
interface Whatsapping {
	void checkWhatsapp();
}
interface FaceBooking {
	void faceBookCheck();
}

class Child extends Father implements Coding, Whatsapping, FaceBooking {

	@Override
	public void faceBookCheck() {
		System.out.println("Child is Checking face book pages....");
		
	}

	@Override
	public void checkWhatsapp() {
		System.out.println("Child Checking new whatsapp messages ....");
		
	}

	@Override
	public void code() {
		System.out.println("Child is Coding in java........");
		
	}

	@Override
	public void bank() {
		System.out.println("Child is banking...in a modern way...");
	}

	@Override
	public void travel() {
		// TODO Auto-generated method stub
		System.out.println("Child is travelling in bullet train..");
	}

	@Override
	public void fightForFreedom() {
		System.out.println("Child is reading freedom fight history...");
	}

	@Override
	public void workInFarm() {
		System.out.println("Child is farming via the robo tractor...");
	}

	@Override
	void talk() {
		System.out.println("Child is talking japanese....");
	}

	@Override
	void giveBirth() {
		System.out.println("Child is giving birth to a virtual girl friend on whatsapp...");
	}

	@Override
	void live() {
		System.out.println("Child is living..god knows in which way today.....");
	}

	@Override
	void die() {
		System.out.println("Child is dying for so many things......");
	}

	@Override
	void breath() {
		System.out.println("Child is breathing....");
	}
	
}

