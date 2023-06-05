package programers;

import java.util.Arrays;

/**
 * packageName    : programers
 * fileName       : Solution12954
 * author         : Hansu
 * date           : 2023-06-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-05        shn81       최초 생성
 */
public class Solution12954 {

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num = x;
        for (int i = 0; i < answer.length; i++) {
            answer[i] = num;
             num += x;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(2, 5)));
    }
}
