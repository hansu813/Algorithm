package programers;

import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * packageName    : programers
 * fileName       : Solution12921
 * author         : Hansu
 * date           : 2023-06-11
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-11        shn81       최초 생성
 */
public class Solution12921 {
    public static int solution(int n) {
        int answer = 0;
        for(int i = 2; i <= n; i++) {
            answer++;
            for(int j = 2; j <= Math.sqrt(i); j++) {
                if(i % j == 0) {
                    answer--;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
    }
}
