package programers;

import java.util.*;

/**
 * packageName    : programers
 * fileName       : Solution76502
 * author         : Hansu
 * date           : 2023-07-01
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-07-01        shn81       최초 생성
 */
public class Solution76502 {
    static int solution(String s) {
        int answer = 0;
        Map<String, String> map = new HashMap<>();
        map.put("(", ")");
        map.put("{", "}");
        map.put("[", "]");
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            String tmp = sb.substring(i, s.length()) + sb.substring(0, i);
            Stack<String> stack = new Stack<>();
            boolean isCheck = true;
            for (String str : tmp.split("")) {
                if (map.containsKey(str)) {
                    stack.push(str);
                } else {
                    if (!stack.isEmpty()) {
                        if (!map.get(stack.peek()).equals(str)) {
                            isCheck = false;
                            break;
                        } else {
                            stack.pop();
                        }
                    } else {
                        isCheck = false;
                        break;
                    }
                }
            }
            if (isCheck && stack.isEmpty()) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("[](){}"));
        System.out.println(solution("}]()[{"));
    }
}
