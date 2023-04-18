package java_basic;

import java.util.Scanner;

/**
 * 백준 2675번
 * 문자열 S를 입력받은 후에, 각 문자를 R번 반복한 후 출력하는 프로그램
 * @author 김한수
 */
public class STRING_05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < num; i++) {
			int r = in.nextInt();
			String s = in.next();
			for(int j = 0; j < s.length(); j++) {
				for(int k = 0; k < r; k++) {
					sb.append(s.charAt(j));
				}
			}
			sb.append('\n');
		}
		in.close();
		System.out.println(sb);
	}
}
