package java_basic;

import java.util.Scanner;
/**
 * 백준 2745번
 * 진법 변환
 * @author 김한수
 *
 */
public class Math01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int n = in.nextInt();
		in.close();
		int tmp = 1;
		int ans = 0;
		for(int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			if('A' <= c && c <= 'Z') {
				ans += (c - 'A' + 10) * tmp;
			} else {
				ans += (c-'0') * tmp;
			}
			tmp *= n;
		}
		System.out.println(ans);
	}

}
