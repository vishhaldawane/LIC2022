import java.awt.FlowLayout;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class ThreadTest2 {
	public static void main(String[] args) {
		System.out.println("Begin main");
		
		Car2 myCar = new Car2(50,100,250,150,"Car"); //3
		Railway2 train = new Railway2(350,100,250,150,"Rail"); //3
		Flight2 jet = new Flight2(650,100,250,150,"Flight"); //3 
		Ship2 ship = new Ship2(950,100,250,150,"Ship"); //3
		
		
		Thread t1 = new Thread(myCar); // 4
		Thread t2 = new Thread(train); // 4
		Thread t3 = new Thread(jet); // 4
		Thread t4 = new Thread(ship); // 4
		
		
		
		t1.start(); //it will invoke the run method of class associated with t1's myCar
		t2.start();
		t3.start();
		t4.start();

		myCar.setVisible(true);
		train.setVisible(true);
		jet.setVisible(true);
		ship.setVisible(true);
		
		System.out.println("End main");
		
	}
}

class Car2 extends JFrame implements Runnable //II. 1
{
	JTextField data = new JTextField(20);
	Car2(int x, int y, int h, int w, String t) {
		setLocation(x, y); // <-- methods from JFrame
		setSize(h,w); // <-- methods from JFrame
		setTitle(t);  // <-- methods from JFrame
		setLayout(new FlowLayout());
		add(data);
	}
	void runningOnRoad() {
		for (int i = 1; i <= 112225; i++) {
			//System.out.println("Car completed "+i+" kms");
			data.setText("Car completed "+i+" kms");
		}
	}
	public void run() { //II. 2 - mandate
		runningOnRoad();
	}
}
class Railway2 extends JFrame implements Runnable //II. 1
{
	JTextField data = new JTextField(20);
	Railway2(int x, int y, int h, int w, String t) {
		setLocation(x, y); // <-- methods from JFrame
		setSize(h,w); // <-- methods from JFrame
		setTitle(t);  // <-- methods from JFrame
		setLayout(new FlowLayout());
		add(data);
	}
	void runningOnRailRoad() {
		for (int i = 1; i <=122150; i++) {
			//System.out.println("\tRailway completed "+i+" kms");
			data.setText("Railway completed "+i+" kms");
		}
	}
	public void run() { //II. 2 - mandate
		runningOnRailRoad();
	}
}

class Flight2 extends JFrame implements Runnable //II. 1
{
	JTextField data = new JTextField(20);
	Flight2(int x, int y, int h, int w, String t) {
		setLocation(x, y); // <-- methods from JFrame
		setSize(h,w); // <-- methods from JFrame
		setTitle(t);  // <-- methods from JFrame
		setLayout(new FlowLayout());
		add(data);
	}
	void flyingInTheSky() {
		for (int i = 1; i <= 122500; i++) {
			//System.out.println("\t\tFlight completed "+i+" aeronautical mile");
			data.setText("Flight completed "+i+" aeronautical mile");
		}
	}
	public void run() { //II 2 - mandate
		flyingInTheSky();
	}
}


class Ship2 extends JFrame implements Runnable //II. 1
{
	JTextField data = new JTextField(20);
	Ship2(int x, int y, int h, int w, String t) {
		setLocation(x, y); // <-- methods from JFrame
		setSize(h,w); // <-- methods from JFrame
		setTitle(t);  // <-- methods from JFrame
		setLayout(new FlowLayout());
		add(data);
	}
	
	void sailingInTheOcean() {
		for (int i = 1; i <= 123300; i++) {
			System.out.println("\t\t\tShip completed "+i+" nautical mile");
			data.setText("Ship completed "+i+" nautical mile");
		}
	}
	public void run() { //II. 2 - mandate
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
 * I way - by extending Thread class
 * 
 * 1. extend from java.lang.Thread
 * 2. override the run() method and put your code which participates in threading
 * 3. create the object of your extended class
 * 4. invoke its start() method -> which will invoke your run() method
 * 			
 * II way - by implementing Runnable interface
 * 
 * 1. implement  from java.lang.Runnable
 * 2. mandate to define the run() method and put your code which participates in threading
 * 3. create the object of your implemented class, created on step 1
 * 4. create the object of java.lang.Thread class
 * 	  and pass your object of step 1 in its constructor
 * 
 * 4. invoke its start() method -> which will invoke your run() method
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
