package data_structure;
/**
 * 연결 리스트 부분 뒤집기
 * 주어진 연결 리스트에서 시작 위치부터 끝 위치 사이의 노드를 뒤집으시오.
 * @author 김한수
 *
 */
public class PracticeLinkedList07 {
	public static LinkedList reverseList(LinkedList list, int left, int right) {
		Node cur1 = null;
		Node prev1 = null;
		
		cur1 = list.head;
		for(int i = 0; i < left - 1; i++) {
			prev1 = cur1;
			cur1 = cur1.next;
		}
		
		Node cur2 = cur1;
		Node prev2 = prev1;
		Node after = null;
		for(int i = left; i <= right; i++) {
			after = cur2.next;
			cur2.next = prev2;
			prev2 = cur2;
			cur2 = after;
		}
		
		prev1.next = prev2;
		cur1.next = cur2;
		
		return list;
	}

	public static void main(String[] args) {
//		Test code
		LinkedList list = new LinkedList();
		list.addData(1);
		list.addData(2);
		list.addData(3);
		list.addData(4);
		list.addData(5);
		list.showData();
		
		list = reverseList(list, 2, 4);
		list.showData();
	}

}
