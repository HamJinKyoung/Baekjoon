import java.util.Calendar;
import java.util.Scanner;

/*
������ 2007�� 1�� 1�� �������̴�. �׷��ٸ� 2007�� x�� y���� ���� �����ϱ�? �̸� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� �� ĭ�� ���̿� �ΰ� x(1��x��12)�� y(1��y��31)�� �־�����.
����� 2007�⿡�� 1, 3, 5, 7, 8, 10, 12���� 31�ϱ���, 4, 6, 9, 11���� 30�ϱ���, 2���� 28�ϱ��� �ִ�.
���
ù° �ٿ� x�� y���� ���� ���������� ���� SUN, MON, TUE, WED, THU, FRI, SAT�� �ϳ��� ����Ѵ�.
 */

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
