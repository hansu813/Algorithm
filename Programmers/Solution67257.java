package programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * packageName    : programers
 * fileName       : Solution67257
 * author         : Hansu
 * date           : 2023-06-14
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-14        shn81       최초 생성
 */
public class Solution67257 {
    public static long solution(String expression) {
        long answer = 0;
        String s = expression.replaceAll("\\+", " + ").replaceAll("\\*", " * ").replaceAll("\\-", " - ");
        ArrayList<Long> longList = new ArrayList<>();
        ArrayList<Character> charList = new ArrayList<>();
        for (String str : s.split(" ")) {
            try {
                longList.add(Long.parseLong(str));
            } catch (NumberFormatException e) {
                charList.add(str.charAt(0));
            }
        }
        char[][] caseC = {{'+', '*', '-'}, {'+', '-', '*'}, {'-', '*', '+'}, {'-', '+', '*'}, {'*', '-', '+'}, {'*', '+', '-'}};
        for (int i = 0; i < caseC.length; i++) {
            ArrayList<Long> longCloneList = new ArrayList<>(longList);
            ArrayList<Character> charCloneList = new ArrayList<>(charList);
            for (int k = 0; k < 3; k++) {
                for (int j = 0; j < charCloneList.size(); j++) {
                    if (caseC[i][k] == charCloneList.get(j)) {
                        long n1 = longCloneList.get(j);
                        long n2 = longCloneList.get(j + 1);
                        long newN = operation(n1, n2, caseC[i][k]);
                        longCloneList.remove(j + 1);
                        longCloneList.remove(j);
                        charCloneList.remove(j);
                        longCloneList.add(j, newN);
                        j--;
                    }
                }
            }
            answer = Math.max(answer, Math.abs(longCloneList.get(0)));
        }
        return answer;
    }

    public static long operation(long n1, long n2, char operator) {
        if (operator == '*') {
            return (n1 * n2);
        } else if (operator == '-') {
            return (n1 - n2);
        }
        return (n1 + n2);
    }

    public static void main(String[] args) {
        System.out.println(solution("100-200*300-500+20"));
        System.out.println(solution("50*6-3*2"));
    }
}
