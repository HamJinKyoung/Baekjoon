import java.util.Scanner;

/*
� ���� ���� X�� �ڸ����� ���������� �̷�ٸ�, �� ���� �Ѽ���� �Ѵ�.
���������� ���ӵ� �� ���� ���� ���̰� ������ ������ ���Ѵ�.
N�� �־����� ��, 1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 

�Է�
ù° �ٿ� 1,000���� �۰ų� ���� �ڿ��� N�� �־�����.

���
ù° �ٿ� 1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����Ѵ�.
 */

public class Q1065 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int count = 0;
		int first, second, third;
		for(int i = 1; i <= n; i++) {
			if(i < 100) {
				count++;
			}
			else if(i < 1000) {
				first = i%10;	// ���� �ڸ���
				second = (i/10)%10;	// ���� �ڸ���
				third = i/100;	// ���� �ڸ���
				if(first - second == second - third) {
					count++;
				}
			}
		}
		System.out.println(count);
		
		stdIn.close();
	}

}
