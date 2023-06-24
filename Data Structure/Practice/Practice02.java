package src.비선형자료구조.연습문제;

/**
 * packageName    : src.비선형자료구조.연습문제
 * fileName       : Practice02
 * author         : Hansu
 * date           : 2023-06-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-24        shn81       최초 생성
 * 연습문제 2)
 * row x col 행렬 형태의 보드에 X, O 표시가 되어있다.
 * 이 때 X로 둘러 쌓인 O는 X로 변경하고
 * 상하좌우 방향으로 O 에 연결되어 있는 O는 그대로 O를 출력하는 프로그램을 작성
 */
public class Practice02 {
    public static void solution(char[][] board) {
        int row = board.length;
        int col = board[0].length;

        for (int i = 0; i < row; i++) {
            if (board[i][0] == 'O') {
                dfs(board, i, 0);
            }

            if (board[i][col - 1] == 'O') {
                dfs(board, i, col - 1);
            }
        }
        for (int i = 0; i < col - 1; i++) {
            if (board[0][i] == 'O') {
                dfs(board, 0, i);
            }
            if (board[row - 1][i] == 'O') {
                dfs(board, row - 1, i);
            }
        }

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
                if(board[i][j] == '*') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    public static void dfs(char[][] board, int x, int y) {
        if (x < 0 || y < 0 || x > board.length - 1 || y > board.length - 1) {
            return;
        }
        if (board[x][y] != 'O') {
            return;
        }

        board[x][y] = '*';
        dfs(board, x + 1, y);
        dfs(board, x - 1, y);
        dfs(board, x, y - 1);
        dfs(board, x, y + 1);
    }

    public static void main(String[] args) {
        // Test code
        char[][] board = {{'X', 'X', 'X', 'X'}, {'X', 'O', 'O', 'X'}, {'X', 'X', 'O', 'X'}, {'X', 'O', 'X', 'X'}};
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        solution(board);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
