package src.알고리즘.정렬;

/**
 * packageName    : src.알고리즘.정렬
 * fileName       : Practice04
 * author         : Hansu
 * date           : 2023-06-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-24        shn81       최초 생성
 * 연습 문제 4 )
 * 정수 배열 arrs 가 주어졌을 때,
 * 오름차순으로 정렬하기 위해 배열 내에서 정렬이 필요한 구간의 길이를 출력
 */
public class Practice04 {
    static int solution(int[] arr) {
        if (arr == null || arr.length < 2) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        int firstIdx = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            min = Math.min(min, arr[i]);
            if (arr[i] > min) {
                firstIdx = i;
            }
        }

        int max = Integer.MIN_VALUE;
        int lastIdx = -1;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            if (arr[i] < max) {
                lastIdx = i;
            }
        }
        return lastIdx - firstIdx + 1;
    }

    public static void main(String[] args) {
        // Test code
        int[] arr = {2, 6, 4, 8, 5, 3, 9, 10};
        System.out.println(solution(arr));
    }
}
