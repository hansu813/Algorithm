package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : baekjoon
 * fileName       : Problem2839
 * author         : Hansu
 * date           : 2023-07-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-07-08        shn81       최초 생성
 * Silver4 - 설탕 배달
 */
public class Problem2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        StringBuilder sb = new StringBuilder();
        while (true) {
            if (n % 5 == 0) {
                sb.append(n / 5 + count);
                break;
            } else if (n < 0) {
                sb.append(-1);
                break;
            }
            n -= 3;
            count++;
        }
        System.out.println(sb.toString());
    }
}
