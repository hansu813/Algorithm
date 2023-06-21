package src.비선형자료구조.우선순위큐;

import java.util.PriorityQueue;

/**
 * packageName    : src.비선형자료구조.우선순위큐
 * fileName       : Practice04
 * author         : Hansu
 * date           : 2023-06-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-21        shn81       최초 생성
 * 연습문제 :
 * 돌의 무게 데이터로 이루어진 정수형 stones 배열이 주어졌을 때 다음의 내용에 따라 프로그램을 작성하세요.
 * 해당 배열로부터 가장 무거운 돌 두개를 꺼낸 뒤,
 * 두 돌을 충돌 시켜서 무게가 같으면 둘다 소멸,
 * 무게가 다르면 남은 무게만큼의 돌은 다시 추가
 * 이 과정을 반복하여 가장 마지막의 돌의 무게를 구하여라.
 */
public class Practice04 {
    static void solution(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> y- x);

        for(int i = 0; i < stones.length; i++) {
            pq.offer(stones[i]);
        }

        while(pq.size() > 1) {
            int target1 = pq.poll();
            int target2 = pq.poll();

            int diff = Math.abs(target1 - target2);
            if(diff != 0) {
                pq.offer(diff);
            }
        }

        System.out.println(pq.poll());
    }

    public static void main(String[] args) {
        int[] stones = {2, 7, 4, 1, 8, 1};
        solution(stones);

        stones = new int[]{5, 3, 5, 3, 4};
        solution(stones);
    }
}
