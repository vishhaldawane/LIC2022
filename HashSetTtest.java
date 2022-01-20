import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class HashSetTtest {
	public static void main(String[] args) {
		
		//synchrodestiny
		
		// Huge data
		// Frequest Insert/update/delete
		
		//charkop sector in Mumbai / new Mumbai
		
		//Delhi - Sectors
		
		
//	10  8   50   5    9   45  65
		
		HashSet<Integer> myNumberSet = new HashSet<Integer>(); //container or rack
		System.out.println("My Number set is ready...");
		
	
		System.out.println("Storing all the numbers in the set...");
		
		myNumberSet.add(10);
		myNumberSet.add(8);
		myNumberSet.add(50);
		myNumberSet.add(5);
		myNumberSet.add(9);
		myNumberSet.add(45);
		myNumberSet.add(65);
		
		System.out.println("Stored all the numbers in the set...");
		
		
		Iterator<Integer> iter = myNumberSet.iterator();
		
		while(iter.hasNext()) {
			
			Integer theNum = iter.next();
			System.out.println("Number is : "+theNum);
		}
		
	}
}
