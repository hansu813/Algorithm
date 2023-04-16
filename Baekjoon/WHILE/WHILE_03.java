package java_basic;

import java.util.Scanner;

/**
 * 백준 2438번
 * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개,
 * N번째 줄에는 별 N개를 찍는 문제
 * @author 김한수
 */
public class WHILE_03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
