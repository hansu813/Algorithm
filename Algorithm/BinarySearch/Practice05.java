package src.알고리즘.이진탐색;

/**
 * packageName    : src.알고리즘.이진탐색
 * fileName       : Practice05
 * author         : Hansu
 * date           : 2023-06-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-24        shn81       최초 생성
 * 정수형 배열 nums 와 정수 m 이 주어진다.
 * nums 에는 양의 정수 값들이 들어 있고, m 은 배열을 부분 배열로 분리할 수 있는 수다.
 * nums 배열을 m 개의 부분 배열로 분리할 때,
 * 각 부분 배열의 합 중 가장 큰 값이 최소가 되도록 분리했을 때의 합을 출력하세요.
 */
public class Practice05 {
    public static int solution(int[] nums, int m) {
        int left = 0;
        int right = 0;

        for (int item : nums) {
            left = Math.max(left, item);
            right += item;
        }
        if (m == 1) {
            return right;
        }
        while (left <= right) {
            int mid = (left + right) / 2;
            int cnt = 1;
            int total = 0;

            for (int num : nums) {
                total += num;
                if (total > mid) {
                    total = num;
                    cnt++;
                }
            }

            if (cnt <= m) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        // Test code
        int[] nums = {7, 2, 5, 10, 8};
        System.out.println(solution(nums, 2));
    }

}
