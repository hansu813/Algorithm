package data_structure;

import java.util.Stack;

/**
 * 스택을 이용한 문자열 뒤집기
 * @author 김한수
 *
 */
public class PracticeStack01 {
	
	public static String reverseString(String str) {
		Stack stack = new Stack();
		String result = "";
		for(String s : str.split("")) {
			stack.push(s);
		}
		while(!stack.isEmpty()) {
			result += stack.pop();
		}
		return result;
	}
	
	public static void main(String[] args) {
		String result = reverseString("Hello");
		System.out.println("result : " + result);
	}

}
