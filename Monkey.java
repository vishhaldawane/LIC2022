package jungle.tree;


public class Monkey {
	public Monkey() {
		System.out.println("Monkey() ctor...");
	}
	void jump() { //1.default
		System.out.println("Monkey is jumping...");
	}
	public void swing() {
		itching();
		System.out.println("Monkey is swinging...");
	}
	private void itching() {
		System.out.println("Monkey is itching.....");
	}
	protected void gigling() {
		itching();
		System.out.println("Monkey is gigling...");
	}
}
class Panther {//non-child - same package 
	void climb() {
		Monkey monkey = new Monkey();
		monkey.itching();
	}
}
class Chimpazee extends Monkey
{
	void eat() {
		jump();//same package
		swing();
		itching();//anyhow not available
		gigling();
	}
}

/*
1.      <-- default
2.public<-- available anywhere
3.private<-- always referred within the class body
4.protected
*/