package programers;

import java.util.Arrays;

/**
 * packageName    : programers
 * fileName       : Solution12940
 * author         : Hansu
 * date           : 2023-06-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-08        shn81       최초 생성
 * 최대공약수와 최소공배수
 */
public class Solution12940 {
    public static int[] solution(int n, int m) {
        int a = Math.max(n, m);
        int b = Math.min(n, m);
        int gcd = gcd(a, b);
        int[] answer = {gcd, (a * b) / gcd};
        return answer;
    }

    public static int gcd(int a, int b) {
        int r = 0;
        while(b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
         return a;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, 12)));
        System.out.println(Arrays.toString(solution(2, 5)));
    }
}
