package programers;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * packageName    : programers
 * fileName       : Solution12935
 * author         : Hansu
 * date           : 2023-06-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-06        shn81       최초 생성
 * 제일 작은 수 제거하기
 */
public class Solution12935 {
    public static int[] solution(int[] arr) {
        int target = 0;
        int min = Integer.MAX_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
                target = i;
            }
        }
        for(int i = 0; i < arr.length; i++) {
            if(i == target) {
                continue;
            }
            list.add(arr[i]);
        }
        if(list.isEmpty()) {
            return new int[] {-1};
        }
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {4, 3, 2, 1})));
        System.out.println(Arrays.toString(solution(new int[] {10})));
    }
}
