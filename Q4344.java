import java.util.Scanner;

/*
���л� ��������� 90%�� �ڽ��� �ݿ��� ����� �Ѵ´ٰ� �����Ѵ�. ����� �׵鿡�� ���� ������ �˷���� �Ѵ�.

�Է�
ù° �ٿ��� �׽�Ʈ ���̽��� ���� C�� �־�����.
��° �ٺ��� �� �׽�Ʈ ���̽����� �л��� �� N(1 �� N �� 1000, N�� ����)�� ù ���� �־�����, �̾ N���� ������ �־�����.
������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.

���
�� ���̽����� �� �پ� ����� �Ѵ� �л����� ������ �ݿø��Ͽ� �Ҽ��� ��° �ڸ����� ����Ѵ�.
 */

public class Q4344 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int c = stdIn.nextInt();
		for(int i = 0; i < c; i++) {
			int n = stdIn.nextInt();
			int[] score = new int[n];
			int sum = 0;
			for(int j = 0; j < n; j++) {
				score[j] = stdIn.nextInt();
				sum += score[j];
			}
			float avg = sum/n;
			int check = 0;
			for(int j = 0; j < n; j++) {
				if(score[j] > avg) {
					check++;
				}
			}
			float rate = (float)check*100/n;
			System.out.printf("%.3f%%", rate);
			System.out.println();
		}
		stdIn.close();
	}

}
