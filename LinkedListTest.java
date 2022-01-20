import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		
		//poor for merging the data inside index
		// if frequest insert / update / delete then arraylist is discouraged
		
		//faster search - by index
		//faster for appending - 
		
		// if you make the stack of the plate
		
		LinkedList<Plate> myPlatesRack = new LinkedList<Plate>(); //container or rack
		System.out.println("Plates rack is ready...");
		
		Plate plate1 = new Plate("White","Circular",100);
		Plate plate2 = new Plate("Blue","Square",120);
		Plate plate3 = new Plate("Green","Oval",150);
		Plate plate4 = new Plate("Red","Circular",120);
		Plate plate5 = new Plate("Yellow","Rectangular",130);
		Plate plate6 = new Plate("Orange","Circular",140);
		System.out.println("Got new plates today....");
	
		System.out.println("Storing all the plates in the rack...");
		
		myPlatesRack.add(plate1);
		myPlatesRack.add(plate2);
		myPlatesRack.add(plate3);
		myPlatesRack.add(plate4);
		myPlatesRack.add(plate5);
		myPlatesRack.add(plate6);
		System.out.println("Stored all the plates in the rack...");
		
		System.out.println("RAck is full of plates..now.....");
		
		Iterator<Plate> iter = myPlatesRack.iterator();
		
		while(iter.hasNext()) {
			
			Plate thePlate = iter.next();
			System.out.println("Plate is : "+thePlate);
		}
		
	}
}
