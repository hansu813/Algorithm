package data_structure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 요세푸스 문제
 * N과 K가 주어졌을 때 (N, K)의 요세푸스 순열을 구하시오,
 * N과 K는 N >= K를 만족하는 양의 정수
 * 1부터 N 번까지 N명이 순서대로 원을 이루어 모여있다.
 * 이 모임에서 원을 따라 순서대로 K번째 사람을 제외
 * 모든 사람이 제외될 때 까지 반복할 때,
 * 제외되는 순서가 요세푸스 순열이다.
 * @author 김한수
 *
 */
public class PracticeQueue02 {
	public static ArrayList<Integer> getJosephus(int N, int K) {
		ArrayList<Integer> list = new ArrayList<>();
		Queue<Integer> queue = new LinkedList<>();
		for(int i = 1; i <= N; i++) {
			queue.add(i);
		}
		while(queue.size() != 0) {
			for(int i = 1; i <= K; i++) {
				int a = queue.poll();
				if(i == K) {
					list.add(a);
					break;
				}
				queue.add(a);
			}
		}
		return list;
	}
	
	public static void main(String[] args) {
		System.out.println(getJosephus(5, 2));
		System.out.println(getJosephus(7, 3));
	}

}
