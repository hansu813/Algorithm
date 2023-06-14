package programers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * packageName    : programers
 * fileName       : Solution133502
 * author         : Hansu
 * date           : 2023-06-14
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-14        shn81       최초 생성
 * 햄버거 만들기
 */
public class Solution133502 {
    public static int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int k : ingredient) {
            stack.push(k);
            if (stack.size() >= 4) {
                if (
                        stack.get(stack.size() - 1) == 1 &&
                                stack.get(stack.size() - 2) == 3 &&
                                stack.get(stack.size() - 3) == 2 &&
                                stack.get(stack.size() - 4) == 1
                ) {
                    answer++;
                    for (int j = 0; j < 4; j++) {
                        stack.pop();
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        System.out.println(solution(ingredient));
    }
}
