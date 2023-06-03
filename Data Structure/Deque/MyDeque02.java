package data_structure;
/**
 * ArrayList를 이용한 데크 구현
 * @author 김한수
 *
 */

import java.util.ArrayList;

class MyDeque1 {
	ArrayList<Integer> list;
	
	public MyDeque1() {
		this.list = new ArrayList<>();
	}
	
	public boolean isEmpty() {
		if(this.list.size() == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public void addFirst(int data) {
		this.list.add(0, data);
	}
	
	public void addLast(int data) {
		this.list.add(data);
	}
	
	public Integer removeFirst() {
		if(this.isEmpty()) {
			System.out.println("Deque is empty");
			return null;
		}
		
		int data = this.list.get(0);
		this.list.remove(0);
		return data;
	}
	
	public Integer removeLast() {
		if(this.isEmpty()) {
			System.out.println("Deque is empty");
			return null;
		}
		
		int data = this.list.get(this.list.size() - 1);
		this.list.remove(this.list.size() - 1);
		return data;
	}
	
	public void printDeque() {
		System.out.println(this.list);
	}
}

public class MyDeque02 {
	public static void main(String[] args) {
//		Test code
		MyDeque1 myDq = new MyDeque1();
//		Front 부분 입력
		myDq.addFirst(1);
		myDq.addFirst(2);
		myDq.addFirst(3);
		myDq.printDeque();
		
//		Rear 부분 입력
		myDq.addLast(10);
		myDq.addLast(20);
		myDq.addLast(30);
		myDq.printDeque();
		
//		Front 부분 출력
		System.out.println(myDq.removeFirst());
		myDq.printDeque();
		
//		Rear 부분 출력
		System.out.println(myDq.removeLast());
		myDq.printDeque();

		System.out.println(myDq.removeLast());
		System.out.println(myDq.removeLast());
		System.out.println(myDq.removeLast());
		System.out.println(myDq.removeLast());
		myDq.printDeque();
	}
}
