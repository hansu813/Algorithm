package data_structure;

import java.util.Stack;

/**
 * 두 문자열 비교
 * 단, #은 backspace로 바로 이전의 문자를 삭제하는 기능
 * @author 김한수
 *
 */
public class PracticeStack04 {
	public static boolean stringCompare(String s1, String s2) {
		String s1After = doBackspace(s1);
		String s2After = doBackspace(s2);
		return s1After.equals(s2After);
	}
	
	public static String doBackspace(String s) {
		Stack<Character> stack = new Stack();
		for(char c : s.toCharArray()) {
			if(c == '#' && !stack.isEmpty()) {
				stack.pop();
			} else {
				stack.push(c);
			}
		}
		return String.valueOf(stack);
	}
	
	public static void main(String[] args) {
//		Test Code
		String s1 = "tree";
		String s2 = "th#ree";
		System.out.println(stringCompare(s1, s2));
		
		s1 = "ad#a";
		s2 = "aad#";
		System.out.println(stringCompare(s1, s2));
		
		s1 = "wo#w";
		s2 = "ww#o";
		System.out.println(stringCompare(s1, s2));
	}

}
