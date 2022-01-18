
public class OopsTest2 {

	public static void main(String[] args) {
		
		char   gender;
		int    age;
		String name;
		
		gender='M';
		age=22;
		name="Jack";
	
		
		char   gender1;
		int    age1;
		String name1;
		
		gender1='F';
		age1=24;
		name1="Julie";
			
		char   gender2;
		int    age2;
		String name2;
		
		gender2='M';
		age2=28;
		name2="Robert";
		
		printPerson(gender,age1,name1);
		printPerson(gender2,age1,name);
		printPerson(gender1,age,name2);
	}
	static void printPerson(char g, int a, String n) {
		System.out.println("gender is "+g);
		System.out.println("age    is "+a);
		System.out.println("name   is "+n);
		System.out.println("-------------");
		
	}

}
