package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : baekjoon
 * fileName       : Problem11729
 * author         : Hansu
 * date           : 2023-07-12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-07-12        shn81       최초 생성
 */
public class Problem11729 {
    static StringBuilder sb = new StringBuilder();

    public static void hanoi(int n, int start, int mid, int to) {
        if (n == 1) {
            sb.append(start).append(" ").append(to).append("\n");
            return;
        }

        hanoi(n - 1, start, to, mid);
        sb.append(start).append(" ").append(to).append("\n");
        hanoi(n - 1, mid, start, to);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = (int) Math.pow(2, n) - 1;
        sb.append(count).append("\n");

        hanoi(n, 1, 2, 3);
        System.out.println(sb.toString());
    }
}
