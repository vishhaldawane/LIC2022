import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
	public static void main(String[] args) {
		
		
		ArrayList<Plate> myPlatesRack = new ArrayList<Plate>(); //container or rack
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
		
		System.out.println("Rack is full of plates..now.....");
		
		Iterator<Plate> iter = myPlatesRack.iterator();
		
		while(iter.hasNext()) {
			
			Plate thePlate = iter.next();
			System.out.println("Plate is : "+thePlate);
		}
		
	}
}
