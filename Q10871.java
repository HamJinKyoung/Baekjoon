import java.util.Scanner;

/*
���� N���� �̷���� ���� A�� ���� X�� �־�����. �̶�, A���� X���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� N�� X�� �־�����. (1 �� N, X �� 10,000)
��° �ٿ� ���� A�� �̷�� ���� N���� �־�����. �־����� ������ ��� 1���� ũ�ų� ����, 10,000���� �۰ų� ���� �����̴�.

���
X���� ���� ���� �Է¹��� ������� �������� ������ ����Ѵ�. X���� ���� ���� ��� �ϳ� �����Ѵ�.
 */

public class Q10871 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int x = stdIn.nextInt();
		
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			if(a[i] < x) {
				System.out.print(a[i] + " ");
			}
		}
		stdIn.close();
	}

}
