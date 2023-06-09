package programers;

import java.util.*;

/**
 * packageName    : programers
 * fileName       : Solution81301
 * author         : Hansu
 * date           : 2023-06-09
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-09        shn81       최초 생성
 */
public class Solution81301 {
    public static int solution(String s) {
        String[] strNum = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < strNum.length; i++) {
            s = s.replace(strNum[i], i + "");
        }
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        String s1 = "one4seveneight";
        System.out.println(solution(s1));
    }
}
