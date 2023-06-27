package src.알고리즘.그리디알고리즘;

/**
 * packageName    : src.알고리즘.그리디알고리즘
 * fileName       : Practice02
 * author         : Hansu
 * date           : 2023-06-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-27        shn81       최초 생성
 * 연습 문제 )
 * 정수형 배열이 주어진다.
 * 각 원소의 값은 해당 위치에서 오른쪽으로 이동할 수 있는 최댓값이다.
 * 첫번째 위치에서 시작해서 가장 끝까지 이동이 가능한지 판별하는 프로그램을 작성
 * 이동이 가능하면 true, 불가능하면 false 반환
 */
public class Practice02 {
    public static boolean solution(int[] nums) {

        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (pos < i) {
                return false;
            } else if (pos >= nums.length - 1) {
                return true;
            }
            pos = Math.max(pos, i + nums[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        // Test code
        int[] nums = {2, 3, 0, 1, 4};
        System.out.println(solution(nums));

        nums = new int[]{3, 0, 0, 1, 1};
        System.out.println(solution(nums));

        nums = new int[]{3, 2, 1, 0, 4};
        System.out.println(solution(nums));
    }

}
