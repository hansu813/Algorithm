package programers;

import java.util.Arrays;

/**
 * packageName    : programers
 * fileName       : Solution12933
 * author         : Hansu
 * date           : 2023-06-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-06        shn81       최초 생성
 * 정수 내림차순으로 배치하기.
 */
public class Solution12933 {
    public static long solution(long n) {
        long answer = 0;
        String s = n + "";
        int[] arr = new int[s.length()];
        for(int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i) - '0';
        }
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++) {
            answer += arr[i] * Math.pow(10, i);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(118372));
    }
}
