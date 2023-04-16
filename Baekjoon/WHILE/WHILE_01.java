package java_basic;

import java.util.Scanner;

/**
 * 백준 2739번
 * N을 입력받은 후, 구구단 N단을 출력하는 프로그램을 작성하시오.
 * @author 김한수
 */
public class WHILE_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		for(int i = 1; i < 10; i++ ) {
			System.out.println(n + " * " + i + " = " + n*i);
		}
	}
}
