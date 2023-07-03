package programers;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName    : programers
 * fileName       : Solution92335
 * author         : Hansu
 * date           : 2023-07-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-07-03        shn81       최초 생성
 */
public class Solution92335 {
    static int solution(int n, int k) {
        int answer = 0;
        String num = Integer.toString(n, k);
        for (String item : num.split("0")) {
            if(item.isEmpty()) {
                continue;
            } else {
                long number = Long.parseLong(item);
                boolean isPrime = isPrime(number);
                if (number != 1 && isPrime) {
                    answer++;
                }
            }
        }
        return answer;
    }

    static boolean isPrime(long n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(solution(437674, 3));
        System.out.println(solution(110011, 10));
    }
}
