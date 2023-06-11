package programers;

import java.util.HashSet;

/**
 * packageName    : programers
 * fileName       : Solution1845
 * author         : Hansu
 * date           : 2023-06-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-10        shn81       최초 생성
 * 폰켓몬
 */
public class Solution1845 {
    public static int solution(int[] nums) {
        int answer = nums.length / 2;
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums) {
            set.add(n);
        }
        return set.size() > answer ? answer : set.size();
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] {3, 1, 2, 3}));
        System.out.println(solution(new int[] {3, 3, 3, 2, 2, 4}));
        System.out.println(solution(new int[] {3, 3, 3, 2, 2, 2}));
    }
}
