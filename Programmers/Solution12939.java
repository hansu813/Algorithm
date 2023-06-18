package programers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * packageName    : programers
 * fileName       : Solution12939
 * author         : Hansu
 * date           : 2023-06-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-18        shn81       최초 생성
 * 최댓값과 최솟값
 */
public class Solution12939 {
    static String solution(String s) {
        List<Integer> list = new ArrayList<>();
        for(String n : s.split(" ")) {
            list.add(Integer.parseInt(n));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Collections.min(list)).append(" ").append(Collections.max(list));
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("1 2 3 4"));
        System.out.println(solution("-1 -2 -3 -4"));
        System.out.println(solution("-1 -1"));
    }
}
