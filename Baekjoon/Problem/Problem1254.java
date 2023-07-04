package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : baekjoon
 * fileName       : Problem1254
 * author         : Hansu
 * date           : 2023-07-04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-07-04        shn81       최초 생성
 */
public class Problem1254 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int ans = s.length();
        for (int i = 0; i < s.length(); i++) {
            if (isPalindrome(s.substring(i))) {
                break;
            }
            ans++;
        }
        System.out.println(ans);
    }

    private static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
