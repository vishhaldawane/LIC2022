public class FunctionTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");	
		function1();		function2(50,60);	
		int total = function3(500,600); System.out.println("total "+total);	
		float pi = function4();	System.out.println("pi "+pi);
	}
	static void function1() {//1
		System.out.println("Hi Im function 1");
	}
	static void function2(int x,int y) {//2
		System.out.println("Hi Im function 2");
		System.out.println("x "+x); System.out.println("y "+y);
	}
	static int function3(int x,int y) {//3
		System.out.println("Hi Im function 3");
		System.out.println("x "+x); System.out.println("y "+y);
		return x+y;
	}
	static float function4() {//4
		System.out.println("Hi Im function 4");
		return 3.14f;
	}

}
