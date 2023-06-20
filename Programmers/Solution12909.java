package programers;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * packageName    : programers
 * fileName       : Solution12909
 * author         : Hansu
 * date           : 2023-06-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-20        shn81       최초 생성
 * 올바른 괄호
 */
public class Solution12909 {
    static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (char item : s.toCharArray()) {
            if (item == '(') {
                stack.push('(');
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(solution(")()("));
        System.out.println(solution("())"));
    }
}
