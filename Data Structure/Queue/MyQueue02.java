package data_structure;
/**
 * ArrayList를 이용한 Queue 구현
 * @author 김한수
 *
 */

import java.util.ArrayList;

class MyQueue1 {
	ArrayList<Integer> list;
	
	MyQueue1() {
		this.list = new ArrayList<>();
	}
	
	public boolean isEmpty() {
		if(this.list.size() == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public void push(int data) {
		this.list.add(data);
	}
	
	public Integer pop() {
		if(this.isEmpty()) {
			System.out.println("Queue is empty");
			return null;
		}
		
		int data = (int)this.list.get(0);
		this.list.remove(0);
		return data;
	}
	
	
	public Integer peek() {
		if(this.isEmpty()) {
			System.out.println("Queue is empty");
			return null;
		}
		
		return (int)this.list.get(0);
	}
	
	public void printQueue() {
		System.out.println(this.list);
	}
}


public class MyQueue02 {
	
	public static void main(String[] args) {
//		Test code
		MyQueue1 myQ = new MyQueue1();
		myQ.push(1);
		myQ.push(2);
		myQ.push(3);
		myQ.push(4);
		myQ.push(5);
		
		myQ.printQueue();
		
		System.out.println(myQ.peek());
		myQ.printQueue();
		
		System.out.println(myQ.pop());
		myQ.printQueue();
		
		System.out.println(myQ.pop());
		myQ.printQueue();
		
		System.out.println(myQ.pop());
		System.out.println(myQ.pop());
		System.out.println(myQ.pop());
		myQ.printQueue();
	}

}
