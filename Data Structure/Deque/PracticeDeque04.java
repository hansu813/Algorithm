package data_structure;


/**
 * 데크 리사이즈
 * 기본 데크 구조에서 데크 공간이 full일 때 데이터를 추가하는 경우
 * 데크 공간을 2배 씩 늘려주는 코드
 * @author 김한수
 *
 */

class MyDeque3 {
	int[] arr;
	int front = 0;
	int rear = 0;
	
	public MyDeque3(int size) {
		this.arr = new int[size + 1];
	}
	
	public boolean isEmpty() {
		return this.rear == this.front;
	}
	
	public boolean isFull() {
		return (this.rear + 1) % this.arr.length == this.front;
	}
	
	public void increaseSize() {
		int[] arrTmp = this.arr.clone();
		this.arr = new int[this.arr.length * 2];
		
		int start = (this.front + 1) % arrTmp.length;
		int end = (this.rear + 1) % arrTmp.length;
		
		int idx = 1;
		for(int i = start; i != end; i = (i - 1) % arrTmp.length) {
			this.arr[idx++] = arrTmp[i];
		}
		
		this.front = 0;
		this.rear = idx - 1;
	}
	
	public void addFirst(int data) {
		if(this.isFull()) {
			increaseSize();
		}
		
		this.arr[this.front] = data;
		this.front = (this.front - 1 + this.arr.length) % this.arr.length; 
	}
	
	public void addLast(int data) {
		if(this.isFull()) {
			increaseSize();
		}
		
		this.rear = (this.rear + 1) % this.arr.length;
		this.arr[this.rear] = data;
	}
	
	public void addMiddle(int data) {
		if(this.isFull()) {
			increaseSize();
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

public class PracticeDeque04 {
	public static void main(String[] args) {
		MyDeque3 myDq = new MyDeque3(5);
		
		myDq.addLast(1);
		myDq.addLast(2);
		myDq.addLast(3);
		myDq.addLast(4);
		myDq.addLast(5);
		myDq.printDeque();
		
		myDq.addLast(6);
		myDq.addLast(7);
		myDq.addLast(8);
		myDq.addLast(9);
		myDq.addLast(10);
		myDq.printDeque();
		
		myDq.removeLast();
		myDq.removeLast();
		myDq.addFirst(100);
		myDq.addFirst(200);
		myDq.printDeque();
		
		myDq.addFirst(300);
		myDq.addFirst(400);
		myDq.addFirst(500);
		myDq.printDeque();
	}
}
