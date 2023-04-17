package java_basic;

import java.util.Scanner;

/**
 * 백준 2562번
 * 9개의 서로 다른 자연수가 주어질 때, 
 * 최댓값을 찾고 이들 중 최댓값이 몇번째 수인지 구하는 프로그램
 * @author 김한수
 */
public class ARRAY_03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[] = new int[9];
		int max = 0;
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
			if(arr[i] > max) {
				max = arr[i];
				index = i + 1;
			}
		}
		in.close();
		System.out.println(max + "\n" + index);
	}
}
