import java.util.Scanner;

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
