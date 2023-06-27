package src.비선형자료구조.연습문제;

/**
 * packageName    : src.비선형자료구조.연습문제
 * fileName       : Practice11
 * author         : Hansu
 * date           : 2023-06-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-27        shn81       최초 생성
 * 일반인의 경우 빨간색과 초록색의 차이를 잘 구분해 내지만, 적록색약인 경우
 * 빨간색과 초록색의 차이를 거의 느끼지 못한다.
 * 따라서 같은 그림이라도 일반인과 적록색약인 사람이 보는 그림은 다를 수 있다.
 * 크기가 N*N 인 그리드의 각 칸에 R, G, B 중 하나를 색칠한 그림이 있다.
 * 이 때, 같은 색상이 상하좌우로 연결한 경우 같은 구역으로 본다.
 * 적록색약의 경우 두 색이 인접한 경우 같은 구역으로 본다.
 * 일반인과 적록색약인 사람의 각각의 구역 수를 출력하시오.
 */
public class Practice11 {
    final static int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    static int[][] normalView;
    static int[][] rgView;

    public static void solution(char[][] pictures) {
        int n = pictures.length;
        normalView = new int[n][n];
        rgView = new int[n][n];

        int normalCnt = 0;
        int rgCnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (normalView[i][j] == 0) {
                    normalCnt++;
                    normalDFS(pictures, j, i, pictures[i][j], normalCnt);
                }
                if (rgView[i][j] == 0) {
                    rgCnt++;
                    rgDFS(pictures, j, i, pictures[i][j], rgCnt);
                }
            }
        }
        System.out.println("일반 : " + normalCnt);
        System.out.println("적록색약 : " + rgCnt);
    }

    public static void normalDFS(char[][] pictures, int x, int y, char color, int cnt) {
        normalView[y][x] = cnt;

        for (int i = 0; i < dirs.length; i++) {
            int xNext = x + dirs[i][0];
            int yNext = y + dirs[i][1];

            if (xNext < 0 || xNext >= normalView.length || yNext < 0 || yNext >= normalView.length) {
                continue;
            }

            if (normalView[yNext][xNext] != 0) {
                continue;
            }

            char nextColor = pictures[yNext][xNext];
            if (nextColor == color) {
                normalDFS(pictures, xNext, yNext, nextColor, cnt);
            }
        }
    }

    public static void rgDFS(char[][] pictures, int x, int y, char color, int cnt) {
        rgView[y][x] = cnt;

        for (int i = 0; i < dirs.length; i++) {
            int xNext = x + dirs[i][0];
            int yNext = y + dirs[i][1];

            if (xNext < 0 || xNext >= rgView.length || yNext < 0 || yNext >= rgView.length) {
                continue;
            }

            if (rgView[yNext][xNext] != 0) {
                continue;
            }

            char nextColor = pictures[yNext][xNext];
            if (nextColor == color || (color == 'R' && nextColor == 'G') || (color == 'G' && nextColor == 'R')) {
                rgDFS(pictures, xNext, yNext, nextColor, cnt);
            }
        }
    }

    public static void main(String[] args) {
        char[][] pictures = {{'R', 'R', 'R', 'B', 'B'}, {'G', 'G', 'B', 'B', 'B'}, {'B', 'B', 'B', 'R', 'R',}, {'B', 'B', 'R', 'R', 'R'}, {'R', 'R', 'R', 'R', 'R'}};
        solution(pictures);
    }
}
