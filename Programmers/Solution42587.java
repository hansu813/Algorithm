package programers;

import java.util.*;

/**
 * packageName    : programers
 * fileName       : Solution42587
 * author         : Hansu
 * date           : 2023-07-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-07-03        shn81       최초 생성
 * 프로세스 - Lv.2
 */
public class Solution42587 {
    static int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> y - x);
        for (int i = 0; i < priorities.length; i++) {
            pq.offer(priorities[i]);
        }
        while (!pq.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == pq.peek()) {
                    answer++;
                    if (i == location) {
                        return answer;
                    }
                    pq.poll();
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] priorities = {2, 1, 3, 2};
        System.out.println(solution(priorities, 2));

        priorities = new int[]{1, 1, 9, 1, 1, 1};
        System.out.println(solution(priorities, 0));
    }
}
