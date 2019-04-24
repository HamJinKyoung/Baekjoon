import java.util.Scanner;

/*
��� �ݻ�ȸ�� �����ϴ� ���� �����ϴ� ����� �̹� ��ȸ�� �γ�ȸ���� �ǰ� �;� �� ���� ������� �ҷ� ��� �ݻ�ȸ�� �����Ϸ��� �Ѵ�.
�� ����Ʈ�� ���ָ� �Ϸ��� ������ �ִµ�, 
��a���� bȣ�� ����� �ڽ��� �Ʒ�(a-1)���� 1ȣ���� bȣ���� ������� ���� �ո�ŭ ������� ������ ��ƾ� �Ѵ١��� ��� ������ �� ��Ű�� ���;� �Ѵ�.
����Ʈ�� ����ִ� ���� ���� ��� ���ֹε��� �� ��� ������ ��Ű�� �Դٰ� �������� ��,
�־����� ���� ���� k�� n�� ���� k���� nȣ���� �� ���� ��� �ִ��� ����϶�.
��, ����Ʈ���� 0������ �ְ� �������� 1ȣ���� ������, 0���� iȣ���� i���� ���.

�Է�
ù ��° �ٿ� Test case�� �� T�� �־�����.
�׸��� ������ ���̽����� �Է����� ù ��° �ٿ� ���� k, �� ��° �ٿ� ���� n�� �־�����.(1 <= k <= 14, 1 <= n <= 14)
���
������ Test case�� ���ؼ� �ش� ���� ���ֹ� ���� ����϶�.
*/

public class Q2775 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		// 14�� ����Ʈ �ʱ�ȭ
		int[][] apt = new int[15][15];
		for(int i = 0; i < 15; i++) {
			apt[0][i] = i+1;
			apt[i][0] = 1;
		}
		for(int i = 1; i < 15; i++) {
			for(int j = 1; j < 15; j++) {
				apt[i][j] = apt[i-1][j] + apt[i][j-1];
			}
		}
		
		int t = stdIn.nextInt();
		for(int i = 0; i < t; i++) {
			int k = stdIn.nextInt();	// ���� �Է�
			int n = stdIn.nextInt();	// ȣ�� �Է�
			System.out.println(apt[k][n-1]);
		}
		stdIn.close();

	}

}