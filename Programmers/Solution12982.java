package programers;

import java.util.Arrays;

/**
 * packageName    : programers
 * fileName       : Solution12982
 * author         : Hansu
 * date           : 2023-06-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-08        shn81       최초 생성
 * 예산
 */
public class Solution12982 {
    public static int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for (int j : d) {
            if (j > budget) {
                break;
            }
            budget -= j;
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] d = {1, 3, 2, 5, 4};
        System.out.println(solution(d, 9));
    }
}
