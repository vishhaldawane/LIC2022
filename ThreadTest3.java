
public class ThreadTest3 {
	public static void main(String[] args) {
		//3. create object of Greeting
		GreetingMessage greet1 = new GreetingMessage("Good morning");
		GreetingMessage greet2 = new GreetingMessage("\tHave a great day");
		GreetingMessage greet3 = new GreetingMessage("\t\tBeautiful morning..");
		
		//4. Create object of Thread
		//   pass your greeting object inside t1
		Thread t1 = new Thread(greet1);
		Thread t2 = new Thread(greet2);
		Thread t3 = new Thread(greet3);
		
		//5. invoke t1's start() -> will invoke greet1's run()
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}
	
}

class Message {
	
}

class GreetingMessage extends Message implements Runnable { //1. implement Runnable
	
	String message;
	
	GreetingMessage(String msg) {
		message = msg;
	}
	
	public void run() { //2. mandate to implement run
		for(int i=1;i<=20;i++) {
			System.out.println("Greeting message : "+message);
		}
	}
}
