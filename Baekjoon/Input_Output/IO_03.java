package java_basic;

import java.util.Scanner;

/**
 * 백준 1001번
 * 두 정수 A와 B를 입력 받은 다음, A-B를 출력하는 프로그램을 작성하시오.
 * @author 김한수
 */
public class IO_03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		System.out.println(A - B);
		in.close();
	}
}
