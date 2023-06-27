package src.비선형자료구조.연습문제;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * packageName    : src.비선형자료구조.연습문제
 * fileName       : Practice12
 * author         : Hansu
 * date           : 2023-06-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-27        shn81       최초 생성
 * N x N 개의 방의 전등 스위치 정보가 2차원 배열 switches 에 주어졌다.
 * 각 방은 1,1 부터 N,N 까지 번호가 매겨져 있다.
 * <p>
 * 예를 들어 switches[i] 가 {1,1,1,2} 라고 하면, (1, 1) 방에서 (1, 2) 방의 불을
 * 켤 수 있다는 의미이다.
 * 켤 수 있는 최대 방의 개수를 출력하는 프로그램을 작성하라
 */
public class Practice12 {
    final static int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public static class room {
        int x;
        int y;

        public room(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static int solution(int n, int[][] switches) {
        ArrayList<room>[][] graph = new ArrayList[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                graph[i][j] = new ArrayList<>();
            }
        }

        for (int i = 0; i < switches.length; i++) {
            graph[switches[i][0] - 1][switches[i][1] - 1].add(new room(switches[i][2] - 1, switches[i][3] - 1));
        }

        boolean[][] switched = new boolean[n][n];
        switched[0][0] = true;

        int cnt = bfs(n, graph, switched);

        return cnt + 1;
    }

    public static int bfs(int n, ArrayList<room>[][] graph, boolean[][] switched) {
        Queue<room> queue = new LinkedList<>();
        queue.offer(new room(0, 0));

        boolean[][] visited = new boolean[n][n];
        visited[0][0] = true;

        int cnt = 0;
        while (!queue.isEmpty()) {
            room cur = queue.poll();
            for(room r : graph[cur.x][cur.y]) {
                if(!switched[r.x][r.y]) {
                    switched[r.x][r.y] = true;
                    cnt++;
                }
            }
            for(int[] dir : dirs) {
                int xNext = cur.x + dir[0];
                int yNext = cur.y + dir[1];

                if(xNext >= 0 && xNext < n && yNext >= 0 && yNext < n) {
                    if(switched[xNext][yNext] && !visited[xNext][yNext]) {
                        queue.offer(new room(xNext, yNext));
                        visited[xNext][yNext] =true;
                    }
                }
            }
        }

        return cnt == 0 ? cnt : cnt + bfs(n, graph, switched);
    }

    public static void main(String[] args) {
        int[][] switches = {{1, 1, 1, 2}, {2, 1, 2, 2}, {1, 1, 1, 3}, {2, 3, 3, 1}, {1, 3, 1, 2}, {1, 3, 2, 1}};
        System.out.println(solution(3, switches));
    }
}
