package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : baekjoon
 * fileName       : Problem2630
 * author         : Hansu
 * date           : 2023-07-11
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-07-11        shn81       최초 생성
 */
public class Problem2630 {
    static int whiteCount = 0;
    static int blueCount = 0;
    static int[][] papers;


    public static void partition(int row, int col, int size) {
        if (isColor(row, col, size)) {
            if (papers[row][col] == 0) {
                whiteCount++;
            } else {
                blueCount++;
            }
            return;
        }
        int newSize = size / 2;
        partition(row, col, newSize);
        partition(row, col + newSize, newSize);
        partition(row + newSize, col, newSize);
        partition(row + newSize, col + newSize, newSize);
    }


    public static boolean isColor(int row, int col, int size) {
        int color = papers[row][col];
        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (papers[i][j] != color) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        papers = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                papers[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        partition(0, 0, n);

        StringBuilder sb = new StringBuilder();
        sb.append(whiteCount).append("\n").append(blueCount);

        System.out.println(sb.toString());
    }
}
