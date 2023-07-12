package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * packageName    : baekjoon
 * fileName       : Problem10610
 * author         : Hansu
 * date           : 2023-07-12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-07-12        shn81       최초 생성
 * Silver 4 - 30
 */
public class Problem10610 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String number = br.readLine();
        int sum = 0;

        char[] arr = number.toCharArray();
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            int n = arr[i] - '0';
            sum += n;
            sb.append(n);
        }

        if (arr[0] != '0' || sum % 3 != 0) {
            System.out.println(-1);
            return;
        }
        System.out.println(sb.toString());
    }
}
