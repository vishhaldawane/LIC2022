
public class Test {
	public static void main(String[] args) {
		Point3D p2 = new Point3D(10,20,70);
		p2.printPoint3D();
		
		Point3D p3 = new Point3D(70,80,40);
		p3.printPoint3D();
		
		Point3D p4 = new Point3D(12,16,80);
		p4.printPoint3D();
		
	}
}

class Point2D
{
	 int x;
	 int y;
	
	Point2D(int a, int b) {
		x = a;
		y = b;
	}
	Point2D() {
		
	}
	void showPoint2D() {
		System.out.println("x "+x);
		System.out.println("y "+y);
	}
}
//Point2D is not Point3D

//But Point3D is Point2D

class Point3D extends Point2D
{
	private int z;
	
	Point3D(int a, int b,int c) {
		
		//super(); //reuse the super class constructor
		//a constructor can only be invoked from another constructor
		x = a;
		y = b;
		z = c;
	}
	void printPoint3D() {
		super.showPoint2D(); // resuse the super class function
		System.out.println("z "+z);
		System.out.println("---------");
	}
}
