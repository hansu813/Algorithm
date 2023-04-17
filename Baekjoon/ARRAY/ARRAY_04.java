package java_basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 백준 10871번
 * 정수 N개로 이루어진 수열 A와 정수 X가 주어진다.
 * 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
 * @author 김한수
 */
public class ARRAY_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[] = new int[in.nextInt()];
		int x = in.nextInt();
		List<Integer> arr2 = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
			if(arr[i] < x) arr2.add(arr[i]); 
		}
		in.close();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < arr2.size(); i++) {
			sb.append(arr2.get(i) + " ");
		}
		System.out.println(sb);
	}
}
