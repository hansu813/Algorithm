package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : baekjoon
 * fileName       : Problem1003
 * author         : Hansu
 * date           : 2023-07-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-07-10        shn81       최초 생성
 * Silver 3 - 피보나치 함수
 */
public class Problem1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Integer[][] dp = new Integer[41][2];
        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            for (int j = 2; j <= n; j++) {
                dp[j][0] = dp[j - 1][0] + dp[j - 2][0];
                dp[j][1] = dp[j - 1][1] + dp[j - 2][1];
            }
            sb.append(dp[n][0]).append(" ").append(dp[n][1]).append("\n");
        }

        System.out.println(sb.toString());
    }
}
