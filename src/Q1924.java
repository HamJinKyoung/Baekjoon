import java.util.Calendar;
import java.util.Scanner;

public class Q1924 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		int date = scanner.nextInt();
		Calendar cal = Calendar.getInstance();
		cal.set(2007, month-1, date);
		int day = cal.get(Calendar.DAY_OF_WEEK);
		switch(day) {
		case 1:
			System.out.println("SUN"); break;
		case 2:
			System.out.println("MON"); break;
		case 3:
			System.out.print("TUE"); break;
		case 4:
			System.out.println("WED"); break;
		case 5:
			System.out.println("THU"); break;
		case 6:
			System.out.println("FRI"); break;
		case 7:
			System.out.println("SAT"); break;
			}
		scanner.close();

	}

}
