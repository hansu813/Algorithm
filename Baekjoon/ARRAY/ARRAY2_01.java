package java_basic;

import java.util.Scanner;

/**
 * 백준 2738번
 * N*M 크기의 두 행렬 A와 B가 주어졌을 때,
 * 두 행렬을 더하는 프로그램을 작성하시오.
 * @author 김한수
 */
public class ARRAY2_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[][] arrA = new int[n][m];
		int[][] arrB = new int[n][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				arrA[i][j] = in.nextInt();
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				arrB[i][j] = in.nextInt();
			}
		}
		in.close();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				sb.append(arrA[i][j] + arrB[i][j]).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
