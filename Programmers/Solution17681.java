package programers;

import java.util.Arrays;

/**
 * packageName    : programers
 * fileName       : Solution17681
 * author         : Hansu
 * date           : 2023-06-09
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-09        shn81       최초 생성
 */
public class Solution17681 {
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] s1 = new String[n];
        String[] s2 = new String[n];
        for (int i = 0; i < n; i++) {
            s1[i] = String.format("%0" + n + "d", Long.parseLong(Long.toBinaryString(arr1[i]))) + "";
            s2[i] = String.format("%0" + n + "d", Long.parseLong(Long.toBinaryString(arr2[i]))) + "";
        }
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (s1[i].charAt(j) == '1' || s2[i].charAt(j) == '1') {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            }
            answer[i] = sb.toString();
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        System.out.println(Arrays.toString(solution(5, arr1, arr2)));
        int[] arr3 = {1};
        int[] arr4 = {0};
        System.out.println(Arrays.toString(solution(1, arr1, arr2)));
    }
}
