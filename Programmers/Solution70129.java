package programers;

import java.util.Arrays;

/**
 * packageName    : programers
 * fileName       : Solution70129
 * author         : Hansu
 * date           : 2023-06-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-19        shn81       최초 생성
 * 이진 변환 반복하기
 */
public class Solution70129 {
    static int[] solution(String s) {
        int[] answer = new int[2];
        while(s.length() > 1) {
            answer[1] += s.length() - s.replaceAll("0", "").length();
            s = Integer.toBinaryString(s.length() - s.replaceAll("1", "").length());
            answer[0]++;
        }
        System.out.println(answer[0] + " " + answer[1]);
        return answer;
    }

    public static void main(String[] args) {
        solution(Arrays.toString(solution("110010101001")));
    }
}
