import java.util.Scanner;

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
