package programers;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * packageName    : programers
 * fileName       : Solution12941
 * author         : Hansu
 * date           : 2023-06-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-21        shn81       최초 생성
 */
public class Solution12941 {
    static int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i = 0; i < A.length; i++) {
            answer += A[i] * B[B.length - 1 - i];
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }

    public static void main(String[] args) {

    }
}
