package java_basic;

import java.util.Scanner;

/**
 * 백준 2566번
 * 9X9 격자판에 쓰여진 81개의 자연수 또는 0이 주어질 때,
 * 이 중 최댓값을 찾고 최댓값의 위치를 구하는 프로그램
 * @author 김한수
 */
public class ARRAY2_02 {
	public static void main(String[] args) {
		int[][] arr = new int[9][9];
		Scanner in = new Scanner(System.in);
		int x = 0, y = 0, max = -1;
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				arr[i][j] = in.nextInt();
				if(arr[i][j] > max) {
					max = arr[i][j];
					x = i + 1;
					y = j + 1;
				}
			}
		}
		in.close();
		System.out.println(max);
		System.out.println(x + " " + y);
 	}
}
