package data_structure.선형자료구조_연습문제;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Stack;

/**
 * packageName    : data_structure.선형자료구조_연습문제
 * fileName       : Practice04
 * author         : Hansu
 * date           : 2023-06-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-07        shn81       최초 생성
 */
public class Practice04 {
    public static void solution(String str) {
        Stack<String> stack = new Stack<>();
        boolean checkFlag = true;

        HashMap<String, String> map = new HashMap<>();
        map.put("(", ")");
        map.put("{", "}");
        map.put("[", "]");
        for (String s : str.split("")) {
            if (map.containsKey(s)) {
                stack.push(s);
            } else if (map.containsValue(s)) {
                if (stack.isEmpty()) {
                    checkFlag = false;
                    break;
                } else {
                    String cur = stack.pop();
                    if (!s.equals(map.get(cur))) {
                        checkFlag = false;
                        break;
                    }
                }
            }
        }
        if (checkFlag && stack.isEmpty()) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
        String str1 = "[yyyy]-[mm]-[dd]";
        solution(str1);

        String str2 = "System.out.println(arr[0][1))";
        solution(str2);

        String str3 = "Support [Java or Python(3, x)]";
        solution(str3);
    }
}
