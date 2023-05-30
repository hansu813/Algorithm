package data_structure;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack stack = new Stack();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println(stack);
		
		System.out.println(stack.pop());
		System.out.println(stack);
		
		System.out.println(stack.pop());
		System.out.println(stack);
		
		System.out.println(stack.peek());
		System.out.println(stack);
		
		System.out.println(stack.contains(1));
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		
		stack.clear();
		System.out.println(stack);
//		stack.pop();

	}

}
