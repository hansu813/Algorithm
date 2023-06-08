package programers;

import java.util.*;
import java.util.stream.IntStream;

/**
 * packageName    : programers
 * fileName       : Solution12906
 * author         : Hansu
 * date           : 2023-06-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-08        shn81       최초 생성
 * 같은 숫자는 싫어
 */
public class Solution12906 {
//    public static int[] solution(int[] arr) {
//        if(arr.length == 1) {
//            return new int[] {arr[0]};
//        }
//        List<Integer> list = new ArrayList<>();
//        list.add(arr[0]);
//        for(int i = 1; i < arr.length; i++) {
//            if(arr[i - 1] != arr[i]) {
//                list.add(arr[i]);
//            }
//        }
//        return list.stream().mapToInt(i -> i).toArray();
//    }

    public static int[] solution(int[] arr) {
        if(arr.length == 1) {
            return new int[] {arr[0]};
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for(int i = 1; i < arr.length; i++) {
            if(arr[i - 1] != arr[i]) {
                stack.push(arr[i]);
            }
        }
        int[] answer = new int[stack.size()];
        for(int i = stack.size() - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        System.out.println(Arrays.toString(solution(arr)));
    }
}
