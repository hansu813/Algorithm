package java_basic;

import java.util.Scanner;

/**
 * 백준 11005번
 * 진법 변환 2
 * @author 김한수
 *
 */
public class Math02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int b = in.nextInt();
		in.close();
		StringBuilder sb = new StringBuilder();
		while(n > 0) {
			if(n % b < 10) {
				sb.append((char) (n % b + '0'));
			} else {
				sb.append((char)(n % b - 10 + 'A'));
			}
			n /= b;
		}
		System.out.println(sb.reverse());
	}
}
