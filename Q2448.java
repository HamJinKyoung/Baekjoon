import java.util.Scanner;

/*
������ ���� ��Ģ�� ������ �ڿ� ���� ��� ������.

�Է�
ù° �ٿ� N�� �־�����. N�� �׻� 3��2^k ���̴�. (3, 6, 12, 24, 48, ...) (k �� 10)

���
ù° �ٺ��� N��° �ٱ��� ���� ����Ѵ�.
 */

public class Q2448 {
	
	static void solution(int k, String[] map) {
		int bottom = 3 * (int)Math.pow(2, k);
        int middle = bottom / 2;
         
        for (int i = middle; i < bottom; ++i) {
            map[i] = map[i - middle] + " " + map[i - middle];
        }
         
        String space = "";
        while (space.length() < middle) {
            space += " ";
        }
        for (int i = 0; i < middle; ++i) {
            map[i] = space + map[i] + space;
        }
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		String map[] = new String[n];
        map[0] = "  *  ";
        map[1] = " * * ";
        map[2] = "*****";
         
        for (int k = 1; 3 * (int)Math.pow(2, k) <= n; ++k) {
            solution(k, map);
        }
         
        for (int i = 0; i < n; ++i) {
            System.out.println(map[i]);
        }
		stdIn.close();
		
	}

}
