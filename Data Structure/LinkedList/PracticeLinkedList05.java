package data_structure;
/**
 * Palindrome 연결리스트
 * 추가 자료 구조 없이 연결 리스트 만으로 풀기
 * 
 * @author 김한수
 *
 */
public class PracticeLinkedList05 {

	public static boolean checkPalindrome(LinkedList list) {
		Node cur = list.head;
		Node left = list.head;
		Node right = null;
		
		int cnt = 0;
		while(cur != null) {
			cnt++;
			right = cur;
			cur = cur.next;
		}
		
		Node prevRight = right;
		for(int i = 0; i < cnt / 2; i++) {
			if(left.data != right.data) {
				return false;
			}
			left = left.next;
			right = left;
			while(right.next != prevRight) {
				right = right.next;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
//		Test code
		LinkedList linkedList = new LinkedList();
		linkedList.addData(1);
		linkedList.addData(3);
		linkedList.addData(5);
		linkedList.addData(3);
		linkedList.addData(1);
		System.out.println(checkPalindrome(linkedList));
		
		linkedList = new LinkedList();
		linkedList.addData(3);
		linkedList.addData(5);
		linkedList.addData(5);
		linkedList.addData(3);
		System.out.println(checkPalindrome(linkedList));
		
		linkedList = new LinkedList();
		linkedList.addData(1);
		linkedList.addData(3);
		linkedList.addData(5);
		linkedList.addData(1);
		System.out.println(checkPalindrome(linkedList));
	}

}
