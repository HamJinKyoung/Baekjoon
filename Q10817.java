import java.util.Scanner;

/*
�� ���� A, B, C�� �־�����. �̶�, �� ��°�� ū ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 

�Է�
ù° �ٿ� �� ���� A, B, C�� �������� ���еǾ� �־�����. (1 �� A, B, C �� 100)
���
�� ��°�� ū ������ ����Ѵ�.
 */

public class Q10817 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		
		if(a>=b && a>=c) {	// a�� �� ū ���
			if(b>c)
				System.out.println(b);
			else
				System.out.println(c);
		}
		else if(b>=a && b>=c) {	// b�� �� ū ���
			if(a>c)
				System.out.println(a);
			else
				System.out.println(c);
		}
		else {	// c�� �� ū ���
			if(a>b)
				System.out.println(a);
			else
				System.out.println(b);
		}
		stdIn.close();
		
	}

}
