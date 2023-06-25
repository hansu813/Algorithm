package src.비선형자료구조.연습문제;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * packageName    : src.비선형자료구조.연습문제
 * fileName       : Practice06
 * author         : Hansu
 * date           : 2023-06-25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-25        shn81       최초 생성
 * n 명의 친구가 참석하는 파티가 계획되어 있다
 * 파티 장소에는 친구들이 앉을 수 있는 충분한 의자들이 있고, 의자에는 0, 1, 2, .. 순으로
 * 번호가 적혀있다.
 * 먼저 도착한 친구 순으로 비어있는 의자 중에서 가장 숫자가 작은 의자에 앉는다.
 * 2차원 정수형 배열 times 와 targetFriend 가 주어졌으며, 각각 의미는 다음과 같다.
 * - times : 친구 별 도착시간과 떠나는 시간
 * - targetFriend : 어디에 앉았는지 확인할 친구
 * 위와 같은 정보를 바탕을 targetFriend 가 앉게 되는 의자 번호를 출력하시오.
 */
public class Practice06 {
    public static int solution(int[][] times, int targetFriend) {
        int targetArrival = times[targetFriend][0];
        Arrays.sort(times, (x, y) -> x[0] - y[0]);
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < times.length; i++) {
            queue.offer(i);
        }

        PriorityQueue<int[]> pqFriend = new PriorityQueue<>((x, y) -> x[0] - y[0]);

        for (int i = 0; i < times.length; i++) {
            while (!pqFriend.isEmpty() && pqFriend.peek()[0] <= times[i][0]) {
                queue.offer(pqFriend.poll()[1]);
            }

            if (times[i][0] == targetArrival) {
                break;
            }
            pqFriend.offer(new int[]{times[i][1], queue.poll()});
        }
        return queue.peek();
    }

    public static void main(String[] args) {
        // Test code
        int[][] times = {{1, 4}, {2, 3}, {4, 6}};
        System.out.println(solution(times, 1)); // 1
        System.out.println();

        times = new int[][]{{3, 10}, {1, 5}, {2, 6}};
        System.out.println(solution(times, 0)); // 2
    }
}
