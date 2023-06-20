package programers;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * packageName    : programers
 * fileName       : Solution120813
 * author         : Hansu
 * date           : 2023-06-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-19        shn81       최초 생성
 * 짝수는 싫어요
 */
public class Solution120813 {
    static int[] solution(int n) {
        return IntStream.range(1, n + 1).filter((x1) -> x1 % 2 != 0).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10)));
        System.out.println(Arrays.toString(solution(15)));
    }
}
