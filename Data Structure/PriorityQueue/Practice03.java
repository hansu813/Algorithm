package src.비선형자료구조.우선순위큐;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

/**
 * packageName    : src.비선형자료구조.우선순위큐
 * fileName       : Practice03
 * author         : Hansu
 * date           : 2023-06-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-21        shn81       최초 생성
 * 연습문제
 * nums 배열에 주어진 정수들 중에서 k 번째로 큰 수를 반환하는 프로그램을 작성하세요.
 * <p>
 * Input : 3, 1, 2, 7, 6, 4
 * k : 2
 * Result : 6
 * <p>
 * Input : 1, 3, 7, 4, 2, 8, 9
 * k : 7
 * Result : 1
 */
public class Practice03 {
    public static int solution(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < nums.length; i++) {
            pq.offer(nums[i]);
        }

        int result = 0;
        for(int i = 0; i  < k; i++) {
            result = pq.poll();
        }
        return result;
    }

    public static int solution2(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public static void main(String[] args) {
        // Test code
        int[] nums = {3, 1, 2, 7, 6, 4};
        System.out.println(solution(nums, 2));
        System.out.println(solution2(nums, 2));

        nums = new int[]{1, 3, 7, 4, 2, 8, 9};
        System.out.println(solution(nums, 7));
        System.out.println(solution2(nums, 7));
    }
}
