package baekjoon;

import java.util.Scanner;
import java.util.Stack;

/**
 * packageName    : baekjoon
 * fileName       : Problem9012
 * author         : Hansu
 * date           : 2023-06-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-19        shn81       최초 생성
 * 괄호
 */
public class Problem9012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        StringBuilder sb = new StringBuilder();
        boolean check = false;
        for(int i = 0; i < n; i++) {
            String s = in.next();
            Stack<String> stack = new Stack<>();
            for(String item : s.split("")) {
                if(item.equals("(")) {
                    stack.add(item);
                } else {
                    if(stack.isEmpty()) {
                        check = true;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if(check) {
                sb.append("NO").append('\n');
            } else {
                if(stack.isEmpty()) {
                    sb.append("YES").append('\n');
                } else {
                    sb.append("NO").append('\n');
                }
            }
            check = false;
            stack.clear();
        }

        System.out.println(sb.toString());
    }
}
