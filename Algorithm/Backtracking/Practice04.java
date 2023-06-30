package src.알고리즘.백트래킹;

import java.util.ArrayList;

/**
 * packageName    : src.알고리즘.백트래킹
 * fileName       : Practice04
 * author         : Hansu
 * date           : 2023-06-30
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-30        shn81       최초 생성
 * 2차원 배열 board 가 주어졌다.
 * 해당 배열 데이터에는 'o', '#', '.'의 정보가 기입되어 있다.
 * o : 동전을 의미
 * # : 벽을 의미
 * . : 빈칸을 의미
 * 동전은 항상 두개가 주어진다.
 * 두 동전이 함께 이동하다가 하나가 보드에서 떨어지는 경우의 최소 이동 횟수를 출력하는 프로그램
 */
public class Practice04 {
    final static int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    static int cnt;

    static class Coin {
        int x;
        int y;

        public Coin(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static void solution(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        cnt = Integer.MAX_VALUE;

        ArrayList<Coin> coins = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 'o') {
                    coins.add(new Coin(j, i));
                }
            }
        }

        Coin coin1 = coins.get(0);
        Coin coin2 = coins.get(1);

        backTracking(board, m, n, coin1.x, coin1.y, coin2.x, coin2.y, 0);
        System.out.println(cnt == Integer.MAX_VALUE ? -1 : cnt);
    }

    static void backTracking(char[][] board, int m, int n, int x1, int y1, int x2, int y2, int moveCnt) {
        if (moveCnt >= 10) {
            return;
        }

        for (int[] dir : dirs) {
            int x1Next = x1 + dir[0];
            int y1Next = y1 + dir[1];

            int x2Next = x2 + dir[0];
            int y2Next = y2 + dir[1];

            int dropCnt = 0;

            if (x1Next < 0 || x1Next >= m || y1Next < 0 || y1Next >= n) {
                dropCnt++;
            }
            if (x2Next < 0 || x2Next >= m || y2Next < 0 || y2Next >= n) {
                dropCnt++;
            }

            if (dropCnt == 2) {
                continue;
            }

            if (dropCnt == 1) {
                cnt = Math.min(cnt, moveCnt + 1);
                return;
            }

            if (board[y1Next][x1Next] == '#') {
                x1Next = x1;
                y1Next = y1;
            }
            if (board[y2Next][x2Next] == '#') {
                x2Next = x2;
                y2Next = y2;
            }

            backTracking(board, m, n, x1Next, y1Next, x2Next, y2Next, moveCnt + 1);

        }
    }

    public static void main(String[] args) {
        // Test case
        char[][] board = {{'.', '#'}, {'.', '#'}, {'.', '#'}, {'o', '#'}, {'o', '#'}, {'#', '#'}};
        solution(board);
    }
}
