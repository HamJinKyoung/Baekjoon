import java.util.Scanner;

/*
N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
출력
입력으로 주어진 숫자 N개의 합을 출력한다.
*/

public class Q11720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int num = scanner.nextInt();
		int dec=1;
		int sum=0;
		for(int j=0;j<n;j++) {
			dec*=10;
		}
		
		for(int i=0;i<=n;i++) {
			sum+=num/dec;
			num=num%dec;
			dec*=0.1;
		}
		
		System.out.println(sum);
		scanner.close();
	}
}
