package programers;

import java.util.Arrays;

/**
 * packageName    : programers
 * fileName       : Solution42842
 * author         : Hansu
 * date           : 2023-07-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-07-03        shn81       최초 생성
 * 카펫 - Lv.2
 */
public class Solution42842 {
    static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        for (int i = 3; i < sum; i++) {
            int j = sum / i;
            if(sum % i == 0 && j >= 3) {
                int col = Math.max(i, j);
                int row = Math.min(i, j);
                if((col - 2) * (row - 2) == yellow) {
                    answer[0] = col;
                    answer[1] = row;
                    return answer;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10, 2)));
    }
}