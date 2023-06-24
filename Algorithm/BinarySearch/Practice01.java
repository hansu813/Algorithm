package src.알고리즘.이진탐색;

import java.util.Arrays;

/**
 * packageName    : src.알고리즘.이진탐색
 * fileName       : Practice01
 * author         : Hansu
 * date           : 2023-06-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-24        shn81       최초 생성
 * target 값이 arr 내에 있으면 해당 인덱스 반환
 * 없으면 해당 값이 있을 경우의 위치에 -1을 곱하고 1을 뺀 값 출력
 */
public class Practice01 {
    public static int solution(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;

            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -left - 1;
    }

    public static void main(String[] args) {
        // Test code
        int[] arr = {1, 2, 5, 10, 20, 30, 40, 50, 60};
        // Java 내의 binary Search 사용
        System.out.println(Arrays.binarySearch(arr, 30));
        System.out.println(Arrays.binarySearch(arr, 3));
        System.out.println(Arrays.binarySearch(arr, 11));
        System.out.println(Arrays.binarySearch(arr, 35));
        System.out.println();
        // 직접 구현
        System.out.println(solution(arr, 30));
        System.out.println(solution(arr, 3));
        System.out.println(solution(arr, 11));
        System.out.println(solution(arr, 35));


    }
}
