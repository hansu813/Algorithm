package data_structure;


/**
 * 배열을 이용한 기본 큐 직접 구현 ( 원형 큐 )
 * @author 김한수
 *
 */
class MyQueue2 {
	int[] arr;
	int front = 0;
	int rear = 0;
	
	public MyQueue2(int size) {
		this.arr = new int[size + 1];
	}
	
	public boolean isEmpty() {
		return this.front == this.rear;
	}
	
	public boolean isFull() {
		return (this.rear + 1) % this.arr.length == this.front;
	}
	
	public void enqueue(int data) {
		if(this.isFull()) {
			System.out.println("Queue is Full");
			return;
		}
		this.rear = (this.rear + 1) % this.arr.length;
		this.arr[this.rear] = data;
	}
	
	public Integer dequeue() {
		if(this.isEmpty()) {
			System.out.println("Queue is empty");
			return null;
		}
		
		front = (front + 1) % this.arr.length;
		return this.arr[front];
	}
	
	public void printQueue() {
		int start = (this.front + 1) % this.arr.length;
		int end = (this.rear + 1) % this.arr.length;
		
		for(int i = start; i != end; i = (i + 1) % this.arr.length) {
			System.out.print(this.arr[i] + " ");
		}
		System.out.println();
	}
	
}

public class MyQueue03 {

	public static void main(String[] args) {
//		Test code
		MyQueue2 myQ = new MyQueue2(5);
		myQ.enqueue(1);
		myQ.enqueue(2);
		myQ.enqueue(3);
		myQ.enqueue(4);
		myQ.enqueue(5);
		myQ.enqueue(6); // Queue is Full!
		
		myQ.printQueue();
		
		System.out.println(myQ.dequeue());
		myQ.printQueue();
		
		System.out.println(myQ.dequeue());
		myQ.printQueue();
		
		myQ.enqueue(6);
		myQ.enqueue(7);
		myQ.printQueue();
		
		System.out.println(myQ.dequeue());
		System.out.println(myQ.dequeue());
		System.out.println(myQ.dequeue());
		myQ.printQueue();
		System.out.println(myQ.dequeue());
		System.out.println(myQ.dequeue());
		myQ.dequeue(); // Queue is empty!
	}

}
