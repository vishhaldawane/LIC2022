
public class StaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Kite.showKiteCount();
		
		
		Kite k1 = new Kite("Pooja","Green",50,true);
		Kite.showKiteCount();
		
		Kite k2 = new Kite("Tanvi","Red",60,true);
		Kite.showKiteCount();
		
		Kite k3 = new Kite("Rama","Yello",70,true);
		Kite.showKiteCount();
		
		int num=100;
		System.out.println("num "+num);
		
		System.out.println("k1 "+k1); // + symbol would invoke toString() for us
		System.out.println("k2 "+k2);
		System.out.println("k3 "+k3);

	}

}
//Object - 11methods in it, one of the method is toString()

class Kite // extends Object - by default parent of all the classes in Java
{
	String owner; //object's data   [ non-static ]
	String color; //object's data   [ non-static ]
	int length;  // object's data   [ non-static ]
	boolean flying; //object's data [ non-static ]
	
	private static int kiteCount; // static is class's data
	
	public static void showKiteCount() {
		System.out.println("Total kites in the sky : "+kiteCount);
	}
	
	
	public Kite(String owner, String color, int length, boolean flying) {
		super();
		System.out.println("Kite(String,String,int,boolean)...ctor...");
		this.owner = owner;
		this.color = color;
		this.length = length;
		this.flying = flying;
		++kiteCount; //increment it 
	}

	@Override
	public String toString() { //overridden from Object class
		return "Kite [owner=" + owner + ", color=" + color + ", length=" + length + ", flying=" + flying + "]";
	}
	
	
}

/*
 
 
 
 
 			stack								heap
 			|
 				
 							
 					kiteCount
 					+-------+
 					|	3	|
 					+-------+
 					
 										
 										owner	color	length	flying   kiteCount X
 										------------------------------------------
 										|		|		|		|		|		|	
 										------------------------------------------
 										100
 			+-------------------------->							
 			|
 			100
 			k1
 			
 										owner	color	length	flying
 										--------------------------------
 										|		|		|		|		|
 										---------------------------------
 										200
 			+-------------------------->							
 			|
 			200
 			k2
 			
 			 							owner	color	length	flying
 										--------------------------------
 										|		|		|		|		|
 										---------------------------------
 										300
 			+-------------------------->							
 			|
 			300
 			k3
 			
 
  				static
 
	field		sharable across all the instances/objects of the class
	
	
	method		is used to refer other static data/members
	
	
	class

*/