package java_basic;

import java.util.Scanner;

/**
 * 백준 10988번
 * 주어진 단어가 팰린드롬인지 아닌지 확인하는 프로그램을 작성하시오.
 * @author 김한수
 */
public class INTANSE_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String word = in.next();
		StringBuffer sb = new StringBuffer(word);
		String reverse = sb.reverse().toString();
		in.close();
		int check = 0;
		if(word.equals(reverse)) check = 1;
		else check = 0;
		System.out.println(check);
	}
}
