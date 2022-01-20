import java.util.Iterator;

public class ThreadTest {
	public static void main(String[] args) {
		System.out.println("Begin main");
		
		Car myCar = new Car(); //3
		Railway train = new Railway(); //3
		Flight jet = new Flight(); //3 
		Ship ship = new Ship(); //3
		
		myCar.start(); //this will initialize the threading env -> run()
		train.start();
		jet.start();
		ship.start();
		
		System.out.println("End main");
		
	}
}

class Car extends Thread //1
{
	void runningOnRoad() {
		for (int i = 1; i <= 25; i++) {
			System.out.println("Car completed "+i+" kms");
		}
	}
	public void run() { //2
		runningOnRoad();
	}
}
class Railway extends Thread //1
{
	void runningOnRailRoad() {
		for (int i = 1; i <=150; i++) {
			System.out.println("\tRailway completed "+i+" kms");
		}
	}
	public void run() { //2
		runningOnRailRoad();
	}
}

class Flight extends Thread //1
{
	void flyingInTheSky() {
		for (int i = 1; i <= 500; i++) {
			System.out.println("\t\tFlight completed "+i+" aeronautical mile");
		}
	}
	public void run() { //2
		flyingInTheSky();
	}
}


class Ship extends Thread //1
{
	void sailingInTheOcean() {
		for (int i = 1; i <= 300; i++) {
			System.out.println("\t\t\tShip completed "+i+" nautical mile");
		}
	}
	public void run() { //2
		sailingInTheOcean();
	}
}


/*
 * 										Runnable
 * 											| run(); <-- abstract
 * 								+-----------+
 * 								|
 * 								|implements
 * 								|
 * 							Thread
 * 							|  run() { }			round robin basis
 * 							|  start() { } ------> JVM Thread Scheduler
 * 							| // 1. extend from it
 * 				----------------------
 * 				|	|	   |	  |
 * 			   Car Railway Flight Ship
 * 			run(){} run(){} run(){} run(){} <-- 2
 * 
 * 
 * 
 * 1. extend from java.lang.Thread
 * 2. override the run() method and put your code which participates in threading
 * 3. create the object of your extended class
 * 4. invoke its start() method -> which will invoke your run() method
 * 			
 * 
 * 
 * 
 * java has four types of methods
 * 
 * 1. exclusive
 * 2. inherited
 * 3. inherited - cum - overridding
 * 4. implemented
 * 
 * 
 * class Doctor {
 * 		void checkTemperature() { } // 1. exclusive
 * 		void chargeFees() {  int fees = 300; }
 * }
 * 
 * interface Surgery {
 * 		void cut();
 * 		void stitch();
 * }
 * 
 * class Surgeon extends Doctor implements Surgery {
 * 	// checkTemperature() is 2. inherited here
 *     void chargeFees() {  int fees = 1500; }// 3. inherited-cum-overriding
 * 
 * 		public void cut() { } // 4. implemented
 * 		public void stitch(){ } // 4. implemented
 * }
 * 
 */
