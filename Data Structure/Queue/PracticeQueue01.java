package data_structure;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 카드 섞기
 * 1 ~ n까지의 번호로 구성된 n장의 카드가 있다.
 * 1번 카드가 가장 위에 그리고 n번 카드는 가장 아래의
 * 상태로 카드가 순서대로 쌓여 있다.
 * 아래의 동작을 카드 한장만 남을 때까지 반복했을 때,
 * 마지막 카드 번호를 출력
 * 1. 가장 위의 카드는 버린다.
 * 2. 그 다음 위의 카드는 쌓여 있는 카드의 가장 아래에 다시 넣는다.
 * @author 김한수
 *
 */
public class PracticeQueue01 {
	public static int findLastCard(int n) {
		Queue<Integer> cards = new LinkedList<>();
		for(int i = 1; i <= n; i++) {
			cards.add(i);
		}
		System.out.println(cards);
		while(cards.size() > 1) {
			cards.poll();
			cards.add(cards.peek());
			cards.poll();
			System.out.println(cards);
		}
		return cards.peek();
	}

	public static void main(String[] args) {
//		Test code
		System.out.println(findLastCard(4));
//		1,2,3,4 -> 3,4,2 -> 2,4 -> 4
		System.out.println(findLastCard(7));
//		1,2,3,4,5,6,7 -> 3,4,5,6,7,2 -> 5,6,7,2,4
//		-> 7,2,4,6 -> 4,6,2 -> 2,6 -> 6
		System.out.println(findLastCard(9));
//		1,2,3,4,5,6,7,8,9 -> 3,4,5,6,7,8,9,2 -> 5,6,7,8,9,2,4
//		-> 7,8,9,2,4,6 -> 9,2,4,6,8 -> 4,6,8,2 -> 8,2,6 -> 6,2
//		-> 2
	}

}
