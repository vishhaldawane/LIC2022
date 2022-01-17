
public class FunctionTest2 {

	public static void main(String[] args) {
		System.out.println("begin main...");
		
		Batsman sachin = new Batsman();
		sachin.batting();
		sachin.facedOvers(19);
		float strikeRate = sachin.calculateStrikeRate(245, 24);
		System.out.println("Strike rate : "+strikeRate);
		
		int currentScore = 0;
		currentScore= sachin.hitBoundry();
		currentScore = currentScore + sachin.hitSixer(); //4 + 6
		currentScore = currentScore + sachin.hitSixer(); // 10 + 6
		currentScore = currentScore + sachin.hitSixer(); // 16 + 6
		currentScore = currentScore + sachin.hitBoundry(); // 22 + 4
		currentScore = currentScore + sachin.hitBoundry(); // 26 + 4
		System.out.println("current score is : "+currentScore);
		
		float strikeRateOfLastOver = sachin.calculateStrikeRate(currentScore, 1);
		System.out.println("Strike rate last over : "+strikeRateOfLastOver);
		
		
	}
	
}

class Batsman
{
	void batting() { //1st
		System.out.println("batsman is batting....");
	}
	void facedOvers(int numberOfOvers) {//2
		System.out.println("batsman has faced "+numberOfOvers+" overs");
	}
	float calculateStrikeRate(int scoreMade,int totalOversPlayed) { //3
		System.out.println("batsman has faced "+totalOversPlayed+" overs and made "+scoreMade+" runs");
		return (scoreMade/(totalOversPlayed*6.0f))*100; //bodmas
	} //int with int yeilds int,  int with float yeilds float,
	//float with double yields double,  int with long= long
	
	int hitSixer() { //4
		System.out.println("batsman is hitting sixer....");
		return 6;
	}
	int hitBoundry() { //4
		System.out.println("batsman is hitting boundry....");
		return 4;
	}
	
}





//batting();
		//Cannot make a static reference to the non-static method 
		//batting() from the type Batsman
		//Batsman.batting(); //using a classname to invoke, means static way 
/*
 * 
 * 
class Fruit
{
	
}

Fruit mango = new Fruit();
		Fruit apple = new Fruit();

*/

