package java_basic;

import java.util.Scanner;

/**
 * 백준 10818번
 * N개의 정수가 주어진다. 이 때, 최솟값과 최댓값을
 * 구하는 프로그램을 작성하시오.
 * @author 김한수
 */
public class ARRAY_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int array[] = new int[in.nextInt()];
		int max=-1000001, min=1000001;
		for (int i = 0; i < array.length; i++) {
			array[i] = in.nextInt();
			if(array[i] > max) max = array[i];
			if(array[i] < min) min = array[i];			
		}
		in.close();
		StringBuilder sb = new StringBuilder();
		sb.append(min).append(" ").append(max);
		System.out.println(sb);
	}
}
