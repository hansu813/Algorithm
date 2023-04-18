package java_basic;

import java.util.Scanner;

/**
 * 백준 11654번
 * 알파벳 소문자, 대문자, 숫자 중 하나가 주어졌을 때, 
 * 주어진 글자의 아스키 코드값을 출력하는 프로그램을 
 * 작성하시오.
 * @author 김한수
 */
public class STRING_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String asc = sc.next();
		char ascii = asc.charAt(0);
		sc.close();
		System.out.println((int)ascii);
	}
}
