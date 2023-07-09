package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * packageName    : baekjoon
 * fileName       : Problem11047
 * author         : Hansu
 * date           : 2023-07-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-07-07        shn81       최초 생성
 * 동전 0
 */
public class Problem11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(coins);

        int idx = n - 1;
        int count = 0;
        while (k > 0 && idx >= 0) {
            if (k >= coins[idx]) {
                k -= coins[idx];
                count++;
            } else {
                idx--;
            }
        }

        System.out.println(count);
    }
}
