package java_basic;

import java.util.Scanner;

/**
 * 백준 10809번
 * 알파벳 소문자로만 이루어진 단어 S가 주어진다.
 * 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음
 * 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을
 * 작성하시오.
 * @author 김한수
 *
 */
public class STRING_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num[] = new int[26];
		String alpa = "abcdefghijklmnopqrstuvwxyz";
		String word = in.next();
		in.close();
		for (int i = 0; i < num.length; i++) {
			num[i] = -1;
		}
		for(int i = 0; i < alpa.length(); i++) {
			for(int j = 0; j < word.length(); j++) {
				if(alpa.charAt(i) == word.charAt(j)) {
					num[i] = j;
					break;
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < num.length; i++) {
			sb.append(num[i]).append(" ");
		}
		System.out.println(sb);
	}
}
