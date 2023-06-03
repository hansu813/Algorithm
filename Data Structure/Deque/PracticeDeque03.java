package data_structure;
/**
 * 데크 변환
 * 데크 구조에서 중간에 데이터를 추가하는 기능을 구현하세요.
 * 단, 추가적인 자료구조를 사용하지 않고 구현
 * @author 김한수
 *
 */
class MyDeque {
	int[] arr;
	int front = 0;
	int rear = 0;
	
	public MyDeque(int size) {
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
	
	public void addMiddle(int data) {
		if(this.isFull()) {
			System.out.println("Deque is Full!");
			return;
		}
		
		int elements = this.rear - this.front;
		if(elements < 0) {
			elements = this.arr.length + elements;
		}
		
		int mid = (this.rear - elements / 2 + this.arr.length) % this.arr.length + 1;
		
		int start = (this.rear + 1) % this.arr.length;
		int end = (this.rear - elements / 2 + this.arr.length) % this.arr.length;
		for(int i = start; i != end; i = (i - 1 + this.arr.length) % this.arr.length) {
			this.arr[i] = this.arr[(i - 1 + this.arr.length) % this.arr.length]; 
		}
		this.arr[mid] = data;
		this.rear = (this.rear + 1) % this.arr.length;
		
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

public class PracticeDeque03 {
	public static void main(String[] args) {
//		Test code
		MyDeque myDq = new MyDeque(5);
//		Front 부분 입력
		myDq.addFirst(1);
		myDq.addFirst(2);
		myDq.addFirst(3);
		myDq.addFirst(4);
		myDq.printDeque();
		
		myDq.addMiddle(10);
		myDq.printDeque();
		
		myDq = new MyDeque(5);
		myDq.addLast(10);
		myDq.addLast(10);
		myDq.addLast(10);
		myDq.addLast(10);
		myDq.addLast(10);
		myDq.removeFirst();
		myDq.removeFirst();
		myDq.removeFirst();
		myDq.removeFirst();
		myDq.addLast(11);
		myDq.addLast(12);
		myDq.addLast(13);
		myDq.printDeque();
		
		myDq.addMiddle(100);
		myDq.printDeque();
	}
}
