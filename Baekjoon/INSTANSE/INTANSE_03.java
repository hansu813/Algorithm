package java_basic;

import java.util.Scanner;

/**
 * 백준 1157번
 * 알파벳 대소문자로 된 단어가 주어지면,
 * 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는
 * 프로그램을 작성하시오.
 * @author 김한수
 */
public class INTANSE_03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[26];
		String word = (in.next()).toUpperCase();
		in.close();
		for (int i = 0; i < word.length(); i++) {
			if('A' <= word.charAt(i) && word.charAt(i) <= 'Z') {
				arr[word.charAt(i) - 'A']++;
			}
		}
		int max = -1;
		char ch = '?';
		for(int i = 0; i <26; i++) {
			if(arr[i] > max) {
				max = arr[i];
				ch = (char)(i + 65);
			}
			else if(arr[i] == max) {
				ch = '?';
			}
		}
		System.out.println(ch);
	}
}
