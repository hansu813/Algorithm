package data_structure;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 선형 자료구조 - 큐
 * @author 김한수
 *
 */
public class MyQueue01 {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		System.out.println(queue);
		
		System.out.println(queue.poll());
		System.out.println(queue);
		
		System.out.println(queue.poll());
		System.out.println(queue);
		
		System.out.println(queue.peek());
		System.out.println(queue);
		
		System.out.println(queue.contains(3));
		System.out.println(queue.size());
		System.out.println(queue.isEmpty());
		
		queue.clear();
		System.out.println(queue);
		System.out.println(queue.poll());
	}

}
