package baekjoon;

import java.util.Scanner;

/**
 * packageName    : baekjoon
 * fileName       : Problem5613
 * author         : Hansu
 * date           : 2023-06-28
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-28        shn81       최초 생성
 */
public class Problem5613 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean checkEqual = true;
        int result = in.nextInt();
        String s = "s";
        while(true) {
            char operate = in.next().charAt(0);
            if(operate == '=') {
                break;
            }
            int num = in.nextInt();
            switch (operate) {
                case '+' : result += num; break;
                case '-' : result -= num; break;
                case '*' : result *= num; break;
                case '/' : result /= num; break;
                default: checkEqual = false; break;
            }
        }

        System.out.println(result);
    }
}
