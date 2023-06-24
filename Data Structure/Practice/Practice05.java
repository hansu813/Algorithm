package src.비선형자료구조.연습문제;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/**
 * packageName    : src.비선형자료구조.연습문제
 * fileName       : Practice05
 * author         : Hansu
 * date           : 2023-06-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-24        shn81       최초 생성
 * x 축 상에 앞 뒤로만 이동할 수 있는 로봇이 0 위치에 놓여진다.
 * 해당 로봇은 다음과 같은 규칙으로 움직일 수 있다.
 * - forward 방향으로는 a 만큼 움직일 수 있다.
 * - backward 방향으로는 b 만큼 움직일 수 있다.
 * - backward 방향으로 연속 2번 움직일 수 없다.
 * - forbidden 위치로는 갈 수 없다.
 * - 음수 지역으로 이동할 수 없다.
 * 몇 번의 이동으로 목적지에 도달 할 수 있는지 계산하는 프로그램 작성
 */
public class Practice05 {
    public static int solution(int[] forbidden, int a, int b, int x) {
        int cnt = 0;
        int limit = x + a + b;

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {0, 0});

        HashSet<int[]> visited = new HashSet<>(queue);
        for(int pos : forbidden) {
            visited.add(new int[] {0, pos});
            visited.add(new int[] {1, pos});
            limit = Math.max(limit, pos + a + b);
        }

        while (!queue.isEmpty()) {
            for (int i = 0; i < queue.size(); i++) {
                int[] cur = queue.poll();
                int dir = cur[0];
                int pos = cur[1];

                if(pos == x) {
                    return cnt;
                }

                int[] forward = new int[]{0, pos + a};
                if(pos + a <= limit && visited.add(forward)) {
                    queue.offer(forward);
                }
                int[] backward = new int[]{1, pos - b};
                if(dir == 0 && pos - b >= 0 && visited.add(backward)) {
                    queue.offer(backward);
                }
            }
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        // Test code
        int[] forbidden = {14, 4, 18, 1, 15};
        System.out.println(solution(forbidden, 3, 15, 9));
    }
}
