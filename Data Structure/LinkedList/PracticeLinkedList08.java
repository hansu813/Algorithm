package data_structure;

import java.util.HashSet;

/**
 * 연결 리스트 배열 사용 연습
 * 주어진 문자열 배열을 연결 리스트 배열로 관리하는 코드를 작성
 * 규칙 ) 각 문자열의 첫 글자가 같은 것 끼리 관리하기.
 * @author 김한수
 *
 */

class Node2 {
	String data;
	Node2 next;
	
	Node2() {}
	Node2(String data, Node2 next) {
		this.data = data;
		this.next = next;
	}
}

class LinkedList2 {
	Node2 head;
	char alphabet;
	
	LinkedList2() {}
	LinkedList2(Node2 node, char alphabet) {
		this.head = node;
		this.alphabet = alphabet;
	}
	
	public boolean isEmpty() {return this.head == null;}
	
	public void addData(String data) {
		if(this.head == null) {
			this.head = new Node2(data, null);
		} else {
			Node2 cur = this.head;
			while(cur.next != null) {
				cur = cur.next;
			}
			cur.next = new Node2(data, null);
		}
	}
	
	public void removeData(String data) {
		if(this.isEmpty()) {
			System.out.println("list is empty");
			return;
		}
		
		Node2 cur = this.head;
		Node2 pre = cur;
		while(cur != null) {
			if(cur.data.equals(data)) {
				this.head = cur.next;
			} else {
				pre.next = cur.next;
			}
			break;
		}
		pre = cur;
		cur = cur.next;
	}
	
	public boolean findData(String data) {
		if(this.isEmpty()) {
			System.out.println("list is empty");
			return false;
		}
		
		Node2 cur = this.head;
		while(cur != null) {
			if(cur.data.endsWith(data)) {
				return true;
			}
			cur = cur.next;
		}
		return false;
	}
	
	public void showData() {
		if(this.isEmpty()) {
			System.out.println("list is empty");
			return;
		}
		
		Node2 cur = this.head;
		while(cur != null) {
			System.out.print(cur.data + " ");
			cur = cur.next;
		}
		System.out.println();
	}
}

public class PracticeLinkedList08 {
	public static void dataCollect(String[] data) {
		HashSet<Character> set = new HashSet<>();
		
		for(String item : data) {
			set.add(item.toCharArray()[0]);
		}
		System.out.println(set);
		
		Character[] arr = set.toArray(new Character[0]);
		LinkedList2[] linkedList = new LinkedList2[set.size()];
		for(int i = 0; i < linkedList.length; i++) {
			linkedList[i] = new LinkedList2(null, arr[i]);
		}
		
		for(String item : data) {
			for(LinkedList2 list : linkedList) {
				if(list.alphabet == item.toCharArray()[0]) {
					list.addData(item);
				}
			}
		}
		
		for(LinkedList2 list : linkedList) {
			System.out.print(list.alphabet + " : ");
			list.showData();
		}
	}
	public static void main(String[] args) {
//		Test code
		String[] input = {"apple", "watermelon", "banana", "apricot", "kiwi", "blueberry", "cherry", "orange"};
		dataCollect(input);
		
	}

}
