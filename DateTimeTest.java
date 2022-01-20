import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTimeTest {
	public static void main(String[] args) {
		
		
		LocalDate today = LocalDate.now();
		
		System.out.println("today is : "+today);
		
		LocalDate anyDate = LocalDate.of(1999, 3, 25);
		System.out.println("any date  is : "+anyDate);
		
		LocalDateTime todayTime = LocalDateTime.now();
		
		System.out.println("today time is : "+today);
		
		LocalDateTime anyDateTime = LocalDateTime.of(1999, 3, 25,20,30,45);
		System.out.println("any date time is : "+anyDateTime);
		
		
	}
}
