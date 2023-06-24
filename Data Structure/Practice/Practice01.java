package src.비선형자료구조.연습문제;

/**
 * packageName    : src.비선형자료구조.연습문제
 * fileName       : Practice1
 * author         : Hansu
 * date           : 2023-06-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-24        shn81       최초 생성
 * row x col 행렬 형태의 board 와 word 문자열이 주어졌을 때,
 * 해당 행렬에서 word 문자열이 인접하게 연결되어 있는지를 확인하는 프로그램을  작성
 */
public class Practice01 {
    final static int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public static boolean solution(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        boolean[][] visited = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (dfs(board, visited, i, j, 0, word)) {
                    return true;
                }
            }
        }


        return false;
    }

    public static boolean dfs(char[][] board, boolean[][] visited, int x, int y, int i, String word) {
        int row = board.length;
        int col = board[0].length;
        if (i == word.length()) {
            return true;
        }
        if (x < 0 || x >= row || y < 0 || y >= col) {
            return false;
        }
        if (visited[x][y]) {
            return false;
        }
        if (board[x][y] != word.charAt(i)) {
            return false;
        }

        visited[x][y] = true;
        for (int[] dir : dirs) {
            int xNext = x + dir[0];
            int yNext = y + dir[1];

            if (dfs(board, visited, xNext, yNext, i + 1, word)) {
                return true;
            }
        }
        visited[x][y] = false;
        return false;
    }

    public static void main(String[] args) {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        System.out.println(solution(board, "ABCCED"));
    }
}
