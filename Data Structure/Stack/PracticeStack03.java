package data_structure;

import java.util.Stack;

/**
 * 후위표기법 연산
 * @author 김한수
 *
 */
public class PracticeStack03 {
	public static double calculate(String str) {
		Stack<Double> stack = new Stack<>();
		
		for(String s : str.split(" ")) {
			if(s.equals("+")) {
				stack.push(stack.pop() + stack.pop());
			} else if(s.equals("-")) {
				stack.push(- stack.pop() + stack.pop());
			} else if(s.equals("*")) {
				stack.push(stack.pop() * stack.pop());
			}else if(s.equals("/")) {
				stack.push(1/stack.pop() * stack.pop());
			} else {
				stack.push(Double.parseDouble(s));
			}
		}
		return stack.pop();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calculate("2 2 +"));
		System.out.println(calculate("2 2 -"));
		System.out.println(calculate("2 2 *"));
		System.out.println(calculate("2 2 /"));
	}

}
