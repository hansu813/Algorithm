package data_structure;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

/**
 * 데이터 재정렬
 * D_0 -> D_1 -> ... -> D_n-1 -> D_n 순으로 되어 있는 데이터를
 * D_0 -> D_n -> D_1 -> D_n-1 ... 순으로 재정렬
 * @author 김한수
 *
 */
public class PracticeDeque01 {
	public static void reorderData(int[] arr) {
		Deque<Integer> deque = new ArrayDeque<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int n : arr) {
			deque.addLast(n);
		}
		while(!deque.isEmpty()) {
			list.add(deque.removeFirst());
			if(!deque.isEmpty()) {
				list.add(deque.removeLast());
			}
		}
		System.out.println("== 정렬 전 ==");
		for(int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i] + " -> ");
		}
		System.out.print(arr[arr.length - 1]);
		System.out.println();
		System.out.println("== 정렬 후 ==");
		for(int i = 0; i < list.size() - 1; i++) {
			System.out.print(list.get(i) + " -> ");
		}
		System.out.print(list.get(list.size() - 1));
		System.out.println();		
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5};
		reorderData(arr1);
		
		int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
		reorderData(arr2);
	}

}
