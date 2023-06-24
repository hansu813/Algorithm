package src.알고리즘.이진탐색;

/**
 * packageName    : src.알고리즘.이진탐색
 * fileName       : Practice02
 * author         : Hansu
 * date           : 2023-06-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-24        shn81       최초 생성
 * 연습문제 2 )
 * 원형 정렬 상태 배엿에서 이진 탐색
 * nums 배열에 원형 상태로 데이터가 정렬되어 있을 때
 * 이진 탐색으로 데이터를 찾는 프로그램을 작성하세요.
 * O(logN) 유지
 * 배열을 재 정렬하지 않고 풀기
 */
public class Practice02 {
    static int solution(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (arr[left] <= arr[mid]) {
                if (target >= arr[left] && target < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (target > arr[mid] && target <= arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        // Test code
        int[] nums = {4, 5, 6, 7, 8, 0, 1, 2};
        System.out.println(solution(nums, 0));
        System.out.println(solution(nums, 3));
    }
}
