package baekjoon;

import java.util.Scanner;

/**
 * packageName    : baekjoon
 * fileName       : Problem2830
 * author         : Hansu
 * date           : 2023-06-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-19        shn81       최초 생성
 * 행성 X3
 */
public class Problem2830 {
    public static long solution(long x, long y) {
        String s1 = Long.toBinaryString(x);
        String s2 = Long.toBinaryString(y);
        int numLength = s1.length() > s2.length() ? s1.length() : s2.length();
        s1 = String.format("%" + numLength + "s", s1);
        s2 = String.format("%" + numLength + "s", s2);
        s1.replaceAll(" ", "0");
        s2.replaceAll(" ", "0");
        String result = "";
        for(int i = 0; i < numLength; i++) {
            if(s1.charAt(i) != s2.charAt(i)) {
                result += "1";
            } else {
                result += "0";
            }
        }
        return Long.parseLong(result, 2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x3 = in.nextInt();
        int[] one = new int[20];
        int num;
        int tmp = 0;
        int idx;
        long answer = 0L;

        for(int i = 0; i < x3; i++) {
            num = Integer.parseInt(in.next());
            idx = 0;
            while(num != 0) {
                tmp = num % 2;
                num = num / 2;
                if(tmp == 1) {
                    one[idx]++;
                }
                idx++;
            }
        }
        for(int i = 0; i < 20; i++) {
            answer += (1L << i) * one[i] * (x3 - one[i]);
        }

        System.out.println(answer);
    }
}
