package src.알고리즘.정렬;

import java.util.Arrays;

/**
 * packageName    : src.알고리즘.정렬
 * fileName       : Practice01
 * author         : Hansu
 * date           : 2023-06-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-24        shn81       최초 생성
 * 연습 문제 1 )
 * nums 배열에 3가지 색으로 구분되는 데이터들이 있다.
 * 0은 흰색, 1은 파랑, 2는 빨강
 * 주어진 nums 배열에서 흰색부터 빨강 순으로 인접하게 정렬시킨 후 출력하는 프로그램 작성
 * <p>
 * 입출력 예시
 * 입력 : 2, 0, 2, 1, 1, 0
 * 출력 : 0, 0, 1, 1, 2, 2
 */
public class Practice01 {
    public static void solution(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        int[] countArr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            countArr[arr[i]]++;
        }

        int idx = 0;
        for (int i = 0; i < countArr.length; i++) {
            while (countArr[i] > 0) {
                arr[idx++] = i;
                countArr[i]--;
            }
        }
    }

    public static void main(String[] args) {
        // Test code
        int[] arr = {2, 0, 2, 1, 1, 0};
        solution(arr);
        System.out.println(Arrays.toString(arr));
    }
}
