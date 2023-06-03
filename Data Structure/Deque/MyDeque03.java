package data_structure;
/**
 * 배열을 이용한 기본 데크 직접 구현
 * @author 김한수
 *
 */
class MyDeque2 {
	int[] arr;
	int front = 0;
	int rear = 0;
	
	public MyDeque2(int size) {
		this.arr = new int[size + 1];
	}
	
	public boolean isEmpty() {
		return this.rear == this.front;
	}
	
	public boolean isFull() {
		return (this.rear + 1) % this.arr.length == this.front;
	}
	
	public void addFirst(int data) {
		if(this.isFull()) {
			System.out.println("Deque is Full!");
			return;
		}
		
		this.arr[this.front] = data;
		this.front = (this.front - 1 + this.arr.length) % this.arr.length; 
	}
	
	public void addLast(int data) {
		if(this.isFull()) {
			System.out.println("Deque is Full!");
			return;
		}
		
		this.rear = (this.rear + 1) % this.arr.length;
		this.arr[this.rear] = data;
	}
	
	public Integer removeFirst() {
		if(this.isEmpty()) {
			System.out.println("Deque is empty");
			return null;
		}
		
		this.front = (this.front + 1) % this.arr.length;
		return this.arr[this.front];
	}
	
	public Integer removeLast() {
		if(this.isEmpty()) {
			System.out.println("Deque is empty");
			return null;
		}
		
		int data = this.arr[this.rear];
		this.rear = (this.rear - 1 + this.arr.length) % this.arr.length;
		return data;
	}
	
	public void printDeque() {
		int start = (this.front + 1) % this.arr.length;
		int end = (this.rear + 1) % this.arr.length;
		
		for(int i = start; i != end; i = (i + 1) % this.arr.length) {
			System.out.print(this.arr[i] + " ");
		}
		System.out.println();
	}
}

public class MyDeque03 {
	public static void main(String[] args) {
//		Test code
		MyDeque2 myDq = new MyDeque2(5);
//		Front 부분 입력
		myDq.addFirst(1);
		myDq.addFirst(2);
		myDq.addFirst(3);
		myDq.printDeque();
		
//		Rear 부분 입력
		myDq.addLast(10);
		myDq.addLast(20);
		myDq.addLast(30); // Deque is Full!
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
