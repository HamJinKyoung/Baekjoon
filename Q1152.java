import java.util.Scanner;

/*
���� ��ҹ��ڿ� ���⸸���� �̷���� ���ڿ��� �־�����. �� ���ڿ����� �� ���� �ܾ ������? �̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
��, �� �ܾ ���� �� �����ϸ� ������ Ƚ����ŭ ��� ����� �Ѵ�.

�Է�
ù �ٿ� ���� ��ҹ��ڿ� ����� �̷���� ���ڿ��� �־�����. �� ���ڿ��� ���̴� 1,000,000�� ���� �ʴ´�.
�ܾ�� ���� �� ���� ���еǸ�, ������ �����ؼ� ������ ���� ����. ���� ���ڿ��� �հ� �ڿ��� ������ ���� ���� �ִ�.
���
ù° �ٿ� �ܾ��� ������ ����Ѵ�.
 */

public class Q1152 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String str = stdIn.nextLine().trim();
		stdIn.close();
		if(str.isEmpty())
			System.out.println(0);
		else {
			char arr[] = str.toCharArray();
			int count = 0;
			for(int i = 0; i < str.length(); i++) {
				if(arr[i] == ' ') {
					count++;
				}
			}
			System.out.println(count+1);
		}
	}

}
