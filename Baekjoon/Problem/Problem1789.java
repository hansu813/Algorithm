package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : baekjoon
 * fileName       : Problem1789
 * author         : Hansu
 * date           : 2023-07-11
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-07-11        shn81       최초 생성
 */
public class Problem1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        br.close();

        long sum = 0;
        long count = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
            if(sum > n) {
                count = i - 1;
                break;
            } else if(sum == n) {
                count = i;
                break;
            }
        }

        System.out.println(count);
    }
}
