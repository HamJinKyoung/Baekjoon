import java.util.Scanner;

/*
n�� �־����� ��, 1���� n���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� n (1 �� n �� 10,000)�� �־�����.
���
1���� n���� ���� ����Ѵ�.
*/

public class Q8393 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum += i;
		}
		System.out.print(sum);
		scanner.close();
	}
}
