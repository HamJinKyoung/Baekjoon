import java.util.Scanner;

/*
어떤 양의 정수 X의 자리수가 등차수열을 이룬다면, 그 수를 한수라고 한다.
등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 

입력
첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.

출력
첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
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
				first = i%10;	// 일의 자리수
				second = (i/10)%10;	// 십의 자리수
				third = i/100;	// 백의 자리수
				if(first - second == second - third) {
					count++;
				}
			}
		}
		System.out.println(count);
		
		stdIn.close();
	}

}
