import java.util.Scanner;

/*
�����̴� �⸻��縦 ���ƴ�. �����̴� ������ �����ؼ� ���� ��������� �ߴ�.
�ϴ� �����̴� �ڱ� ���� �߿� �ִ��� �����. �� ���� M�̶�� �Ѵ�. �׸��� ���� ��� ������ ����/M*100���� ���ƴ�.
���� ���, �������� �ְ����� 70�̰�, ���������� 50�̾����� ���������� 50/70*100�� �Ǿ� 71.43���� �ȴ�.
�������� ������ ���� ������ ���� ������� ��, ���ο� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� ���� �� ������ ���� N�� �־�����. �� ���� 1000���� �۰ų� ����.
��° �ٿ� �������� ���� ������ �־�����. �� ���� 100���� �۰ų� ���� ���� �ƴ� �����̰�, ��� �ϳ��� ���� 0���� ũ��.

���
ù° �ٿ� ���ο� ����� ����Ѵ�. ������� ����/��� ������ 10^(-2)���� ����Ѵ�.
*/

public class Q1546 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		float[] grade = new float[n];
		for(int i = 0; i < n; i++) {
			grade[i] = stdIn.nextInt();
		}
		
		// �ִ�ã��
		float m = grade[0];
		for(int i = 1; i < n; i++) {
			if(m < grade[i])
				m = grade[i];
		}
		
		// ���� ����
		for(int i = 0; i < n; i++) {
			grade[i] = grade[i] / m * 100;
		}
		
		// ���
		float sum = 0;
		for(int i = 0; i < n; i++) {
			sum += grade[i];
		}
		float avg = sum / n;
		System.out.println(avg);
		
		stdIn.close();
	}

}
