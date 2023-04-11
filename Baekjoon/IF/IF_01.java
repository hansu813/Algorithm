package java_basic;

import java.util.Scanner;

/**
 * 백준 1330번
 * 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
 * @author 김한수
 *
 */
public class IF_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		in.close();
		if(a > b) {
			System.out.println('>');
		} else if(a < b) {
			System.out.println('<');
		} else {
			System.out.println("==");
		}
	}
}
