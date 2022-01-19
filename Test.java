package jungle.use;

import jungle.tree.Monkey;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monkey monkey = new Monkey();
		monkey.jump();
		monkey.swing();
		monkey.itching();
		monkey.gigling();
	}
}
class Gorilla extends Monkey
{
	void eat() {
		jump();//outside package 
		swing();
		itching();//any how not available
		gigling();
	}
}
