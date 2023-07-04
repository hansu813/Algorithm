package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * packageName    : baekjoon
 * fileName       : Problem3273
 * author         : Hansu
 * date           : 2023-07-04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-07-04        shn81       최초 생성
 * 두 수의 합
 */
public class Problem3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            arr[i] = a;
        }
        int x = Integer.parseInt(br.readLine());
        br.close();

        Arrays.sort(arr);
        int left = 0;
        int right = n - 1;
        int cnt = 0;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == x) {
                cnt++;
                left++;
                right--;
            } else if (sum > x) {
                right--;
            } else {
                left++;
            }
        }

        System.out.println(cnt);
    }
}
