package data_structure;
/**
 * 원형 연결 리스트
 * @author 김한수
 *
 */
class CircularLinkedList {
	NodeBi head;
	NodeBi tail;
	
	public CircularLinkedList(NodeBi node) {
		this.head = node;
		this.tail = node;
		node.next = this.head;
		node.prev = this.head;
	}
	
	public boolean isEmpty() {
		if(this.head == null) {
			return true;
		}
		return false;
	}
	
//	연결리스트 데이터 추가
//	before_data가 null인 경우 가장 뒤에 추가
//	before_data에 값이 있는 경우 해당 값을 가진 노드 앞에 추가
	public void addData(int data, Integer beforeData) {
		if(this.head == null) {
			NodeBi newNodeBi = new NodeBi(data, null, null);
			this.head = newNodeBi;
			this.tail = newNodeBi;
			newNodeBi.next = newNodeBi;
			newNodeBi.prev = newNodeBi;
		} else if(beforeData == null) {
			NodeBi newNodeBi = new NodeBi(data, this.head, this.tail);
			this.tail.next = newNodeBi;
			this.head.prev = newNodeBi;
			this.tail = newNodeBi;
		} else {
			NodeBi cur = this.head;
			NodeBi prev = cur;
			do {
				if(cur.data == beforeData) {
					if(cur == this.head) {
						NodeBi newNodeBi = new NodeBi(data, this.head, this.tail);
						this.tail.next = newNodeBi;
						this.head.prev = newNodeBi;
						this.head = newNodeBi;
					} else {
						NodeBi newNodeBi = new NodeBi(data, cur, prev);
						prev.next = newNodeBi;
						cur.prev = newNodeBi;
					}
					break;
				}
				prev = cur;
				cur = cur.next;
			} while(cur != this.head);
		}
		
	}
//	연결 리스트에서 특정 값을 가진 노드 삭제
	public void removeData(int data) {
		if(this.isEmpty()) {
			System.err.println("list is empty");
			return;
		}
		NodeBi cur = this.head;
		NodeBi prev = cur;
		while(cur != null) {
			if(cur.data == data) {
				if(cur == this.head && cur == this.tail) {
					this.head = null;
					this.tail = null;
				} else if(cur == this.head) {
					cur.next.prev = this.head.prev;
					this.head = cur.next;
					this.tail.next = this.head;
				} else if(cur == this.tail){
					prev.next = this.tail.next;
					this.tail = prev;
					this.head.prev = this.tail;
				} else {
					prev.next = cur.next;
					cur.next.prev = prev;
				}
				break;
			}
			prev = cur;
			cur = cur.next;
		}
	}
	
	public void showData() {
		if(this.isEmpty()) {
			System.err.println("list is empty");
			return;
		}
		
		NodeBi cur = this.head;
		while(cur.next != this.head) {
			System.out.print(cur.data + " ");
			cur = cur.next;
		}
		System.out.println(cur.data);
	}
}

public class PracticeLinkedList03 {

	public static void main(String[] args) {
//		Test Code
		CircularLinkedList myList = new CircularLinkedList(new NodeBi(1, null, null));
		myList.addData(2, null);
		myList.addData(3, null);
		myList.addData(4, null);
		myList.addData(5, null);
		myList.showData();
		
		myList.addData(100, 1);
		myList.addData(200, 2);
		myList.addData(300, 3);
		myList.addData(400, 4);
		myList.addData(500, 5);
		myList.showData();
		
		myList.removeData(300);
		myList.removeData(100);
		myList.removeData(500);
		myList.removeData(200);
		myList.removeData(400);
		myList.showData();
		
		myList.removeData(3);
		myList.removeData(1);
		myList.removeData(5);
		myList.removeData(2);
		myList.removeData(4);
		myList.showData();
	}

}
