
public class FunctionOverloadingTest {
	public static void main(String[] args) {
		
		Phone myPhone = new Phone();
		myPhone.dial();
		
		byte ambulance=102;
		myPhone.dial(ambulance);	
		
		short interComm = 1234;
		myPhone.dial(interComm);
		
		myPhone.dial("Anjali");
		
		myPhone.dial("Jack", "Julie");
		
		byte code=11;
		int  num = 123123;
		
		myPhone.dial(code, num);
		
		byte code1=22;
		int num2=929383;
		
		myPhone.dial(num2, code1);
		
	}
}

class Phone {
	void dial() {
		System.out.println("dial()....");
	}
	void dial(byte number) {
		System.out.println("dial(byte)...."+number);
	}
	void dial(short number) {
		System.out.println("dial(short)...."+number);
	}
	void dial(String name) {
		System.out.println("dial(String)...."+name);
	}
	void dial(String name,String name2) {
		System.out.println("dial(String,String)...."+name+" with another friend "+name2);
	}
	void dial(byte stdCode, int number) {
		System.out.println("dial(byte,int)....stdCode:("+stdCode+")"+number);
	}
	void dial(int number,byte stdCode) {
		System.out.println("dial(int,byte)....stdCode:("+stdCode+")"+number);
	}
}
