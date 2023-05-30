package data_structure;

import java.util.Stack;

/**
 * 괄호의 짝이 맞는지 검사
 * @author 김한수
 *
 */
public class PracticeStack02 {
	public static void checkParenthesis(String str) {
		boolean checkFlag = true;
		Stack stack = new Stack<>();
		for(String s : str.split("")) {
			if(s.equals("(")) {
				stack.add(s);
			} else if(s.equals(")")) {
				if(stack.isEmpty()) {
					checkFlag = false;
					break;
				} else {
					stack.pop();
				}
			}
		}
		if(checkFlag && stack.size() == 0) {
			System.out.println("PASS!");
		} else {
			System.out.println("FAIL!");
		}
	}
	
	public static void main(String[] args) {
		checkParenthesis("(");
		checkParenthesis(")");
		checkParenthesis("()");
		checkParenthesis("()()()");
		checkParenthesis("(())()");
		checkParenthesis("(((()))");
	}
}
