package java_basic;

import java.util.Scanner;
/**
 * 백준 2720
 * 세탁소 사장 동혁
 * @author 김한수
 *
 */
public class Math03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] money = {25, 10, 5, 1};
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			int a = in.nextInt();
			for(int j = 0; j < 4; j++) {
				sb.append(a / money[j] + " ");
				a %= money[j];
			}
			sb.append("\n");
		}
		in.close();
		System.out.println(sb);
	}

}
