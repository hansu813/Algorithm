package baekjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * packageName    : baekjoon
 * fileName       : Problem26008
 * author         : Hansu
 * date           : 2023-06-16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-16        shn81       최초 생성
 */
public class Problem26008 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long n = in.nextInt();
        long m = in.nextInt();
        long a = in.nextInt();
        long h = in.nextInt();
        in.close();
        long answer = 1;

        for(int i = 0; i < n - 1; i ++) {
            answer = (answer * m) % 1000000007;
        }
        System.out.println(answer);

    }
}
