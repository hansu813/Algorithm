package java_basic;

import java.util.Scanner;

/**
 * 백준 2743번
 * 알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하시오.
 * @author 김한수
 */
public class STRING_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String word = in.next();
		in.close();
		System.out.println(word.length());
	}
}
