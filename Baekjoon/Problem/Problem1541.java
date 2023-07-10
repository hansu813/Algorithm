package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : baekjoon
 * fileName       : Problem1541
 * author         : Hansu
 * date           : 2023-07-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-07-10        shn81       최초 생성
 * Silver 2 - 잃어버린 괄호
 */
public class Problem1541 {
    static int addition(String str) {
        int tmp = 0;
        String[] addition = str.split("\\+");

        for (int i = 0; i < addition.length; i++) {
            tmp += Integer.parseInt(addition[i]);
        }

        return tmp;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] expression = br.readLine().split("-");

        int sum = addition(expression[0]);
        for (int i = 1; i < expression.length; i++) {
            sum -= addition(expression[i]);
        }

        System.out.println(sum);
    }
}
