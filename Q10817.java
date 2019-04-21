import java.util.Scanner;

/*
세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 

입력
첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. (1 ≤ A, B, C ≤ 100)
출력
두 번째로 큰 정수를 출력한다.
 */

public class Q10817 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		
		if(a>=b && a>=c) {	// a가 젤 큰 경우
			if(b>c)
				System.out.println(b);
			else
				System.out.println(c);
		}
		else if(b>=a && b>=c) {	// b가 젤 큰 경우
			if(a>c)
				System.out.println(a);
			else
				System.out.println(c);
		}
		else {	// c가 젤 큰 경우
			if(a>b)
				System.out.println(a);
			else
				System.out.println(b);
		}
		stdIn.close();
		
	}

}
