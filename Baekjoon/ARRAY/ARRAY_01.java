package java_basic;

import java.util.Scanner;

/**
 * 백준 10807번
 * 첫째 줄에 정수의 개수 n이 주어진다. 둘째 줄에는 정수가 공백으로
 * 구분되어져 있다.
 * 셋째 줄에는 찾으려고 하는 정수 v가 주어진다.
 * @author 김한수
 */
public class ARRAY_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		int v = in.nextInt();
		in.close();
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] == v) {
				j++;
			} else {
				continue;
			}
		}
		System.out.println(j);
	}
}
