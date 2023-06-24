package programers;

import java.util.Arrays;

/**
 * packageName    : programers
 * fileName       : Solution42747
 * author         : Hansu
 * date           : 2023-06-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-24        shn81       최초 생성
 * H-Index
 */
public class Solution42747 {
    static int solution(int[] citations) {
        Arrays.sort(citations);
        int answer = 0;
        for(int i = 0; i < citations.length; i++) {
            int hIdx = citations.length - i;
            if(citations[i] >= hIdx) {
                answer = hIdx;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 0, 6, 1, 5}));
    }
}
