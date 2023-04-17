package java_basic;

import java.util.Scanner;

/**
 * 백준 27866번
 * 단어 S와 정수 i가 주어졌을 때, S의 i번째 글자를 출력하시오.
 * @author 김한수
 */
public class STRING_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		int i = in.nextInt();
		in.close();
		System.out.println(str.charAt(i-1));
	}
}
