package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : baekjoon
 * fileName       : Problem5585
 * author         : Hansu
 * date           : 2023-07-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-07-10        shn81       최초 생성
 * Bronze 2 - 거스름돈
 */
public class Problem5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int pay = 1000 - Integer.parseInt(br.readLine());

        int[] coins = {500, 100, 50, 10, 5, 1};
        int idx = 0;
        int count = 0;

        while (pay > 0) {
            if (coins[idx] <= pay) {
                count++;
                pay -= coins[idx];
            } else {
                idx++;
            }
        }

        System.out.println(count);
    }
}
