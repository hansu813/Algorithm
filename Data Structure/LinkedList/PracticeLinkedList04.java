package data_structure;
/**
 * 단방향 리스트에서 중복 데이터를 찾아 삭제하시오.
 * 
 * 입력 연결 리스트 : 1, 3, 3, 1, 4, 2, 4, 2
 * 결과 연결 리스트 : 1, 3, 4, 2
 * @author 김한수
 *
 */

//class Node {
//	int data;
//	Node next;
//	
//	Node() {}
//	Node(int data, Node next) {
//		this.data = data;
//		this.next = next;
//	}
//}

class LinkedList {
	Node head;
	
	LinkedList() {};
	LinkedList(Node node) {
		this.head = node;
	}
	
//	연결 리스트 비어있는지 확인
	public boolean isEmpty() {
		if(this.head == null) {
			return true;
		}
		return false;
	}
	
//	연결 리스트 맨 뒤에 데이터 추가
	public void addData(int data) {
		if(this.head == null) {
			this.head = new Node(data, null);
		} else {
			Node cur = this.head;
			while(cur.next != null) {
				cur = cur.next;
			}
			cur.next = new Node(data, null);
		}
	}
	
//	연결 리스트의 맨 뒤 데이터 삭제
	public void removeData() {
		if(this.isEmpty()) {
			System.out.println("list is empty");
			return;
		}
		
		Node cur = this.head;
		Node prev = cur;
		
		while(cur.next != null) {
			prev = cur;
			cur = cur.next;
		} 
		
		if(cur == this.head) {
			this.head = null;
		} else {
			prev.next = null;
		}
	}
	
//	연결 리스트에서 데이터 찾기
	public boolean findData(int data) {
//		if(this.isEmpty()) {
//			System.out.println("list is empty");
//		}
		
		Node cur = this.head;
		while(cur != null) {
			if(cur.data == data) {
				return true;
			}
			cur = cur.next;
		}
		return false;
	}
	
//	연결 리스트의 모든 데이터 출력
	public void showData() {
		if(this.isEmpty()) {
			System.out.println("list in empty");
			return;
		}
		
		Node cur = this.head;
		while(cur != null) {
			System.out.print(cur.data + " ");
			cur = cur.next;
		}
		System.out.println();
	}
}

public class PracticeLinkedList04 {

	public static LinkedList removeDup(LinkedList listBefore) {
		LinkedList listAfter = new LinkedList();
		
		Node cur = listBefore.head;
		while(cur != null) {
			if(listAfter.findData(cur.data) == false) {
				listAfter.addData(cur.data);
			}
			cur = cur.next;
		}
		return listAfter;
	}
	
	public static void main(String[] args) {
//		Test code
		LinkedList linkedList = new LinkedList();
		linkedList.addData(1);
		linkedList.addData(3);
		linkedList.addData(3);
		linkedList.addData(1);
		linkedList.addData(4);
		linkedList.addData(2);
		linkedList.addData(4);
		linkedList.addData(2);
		linkedList.showData();
		
		linkedList = removeDup(linkedList);
		linkedList.showData();
	}

}
