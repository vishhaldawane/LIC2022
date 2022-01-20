
public class CollectionTest {
	public static void main(String[] args) {
		
		/*
		Plate plate1 = new Plate("White","Circular",100);
		Plate plate2 = new Plate("Blue","Square",120);
		Plate plate3 = new Plate("Green","Oval",150);
		Plate plate4 = new Plate("Red","Circular",120);
		Plate plate5 = new Plate("Yellow","Rectangular",130);
		Plate plate6 = new Plate("Orange","Circular",140);
		
		System.out.println("plate1 : "+plate1);
		System.out.println("plate2 : "+plate2);
		System.out.println("plate3 : "+plate3);
		System.out.println("plate4 : "+plate4);
		System.out.println("plate5 : "+plate5);
		System.out.println("plate6 : "+plate6);
		*/
		
		/*
		 * 				<----------plateArray -------------------------->
		 * 					0		1		2		3		4		5
		 * 				-------------------------------------------------
		 * 				|  100	|	200	|		|		|		|		|
		 * 				----|--------|-------------------------------------
		 * 					|		 |
		 * 					|		 |			 color	shape 		weigth
		 * 					|		 +-------200 Blue	Square		120
		 * 					|				 	
		 * 					|
		 * 					|					color	shape 		weigth
		 * 					+------------>100	White	Circular	100
		 */
		
		Plate plateArray[] = new Plate[6]; //array of 6 Plate References [ not objects ] 
		
		plateArray[0] = new Plate("White","Circular",100);
		plateArray[1] = new Plate("Blue","Square",120);
		plateArray[2] = new Plate("Green","Oval",150);
		plateArray[3] = new Plate("Red","Circular",120);
		plateArray[4] = new Plate("Yellow","Rectangular",130);
		plateArray[5] = new Plate("Orange","Circular",140);
		
		//plateArray[6] = new Plate("Magenta","Circular",160);
		
		for(int i=0;i<plateArray.length;i++) {
			System.out.println("plate : "+plateArray[i]);
		}
	}
}

class Plate
{
	String color;
	String shape;
	int weight;//in grams
	
	public Plate(String color, String shape, int weight) {
		super();
		this.color = color;
		this.shape = shape;
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "Plate [color=" + color + ", shape=" + shape + ", weight=" + weight + "]";
	}
	
	
}
/*

		Data type	Container		Iterator		Algorithm
		|				|					|			|
		SoftDrink   -> Bottle		<--- Straw ---->	drink();
		ButterMilk	-> Glass		<--- Straw ---->    drink();
		FriedRice	-> Plate		<--- Spoon ---->    eat();
		PaneerChilly-> Plate		<--- Fork ---->		eat();
		Noodles		-> Bowl			<-- ChopSticks-->	eat();
		Pickle		-> Plate		<--- Finger -->		lickIt();
	
	
							Iterable <-interface
								|
							Collection <-- iterface
								|
					-------------------------
					|					|
					List				Set <-- interfaces
					|duplicates			|unique
			-------------			--------------
			|			|			|			|
		ArrayList		LinkedList	TreeSet	  HashSet <-- classes
		|
		growable array
		
		
		
		
		
		
		
		

*/