package src.비선형자료구조.우선순위큐;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * packageName    : src.비선형자료구조.우선순위큐
 * fileName       : Practice06
 * author         : Hansu
 * date           : 2023-06-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-21        shn81       최초 생성
 * 연습문제 :
 * 문자열 s 가 주어졌을 때, 문자열 내에 동일한 알파벳이 연속적으로 배치되지 않도록
 * 재배치 하세요.
 * 재배치가 가능한 경우 재배치한 문자열을 반환, 안된다면 null을 반환
 */
public class Practice06 {
    static String solution(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> pq =
                new PriorityQueue<>((x, y) -> y.getValue() - x.getValue());

        for(Map.Entry<Character, Integer> item : map.entrySet()) {
            pq.offer(item);
        }

        StringBuilder sb = new StringBuilder();
        Map.Entry<Character, Integer> prev = null;
        while(!pq.isEmpty()) {
            Map.Entry<Character, Integer> cur = pq.poll();

            if(prev != null && prev.getValue() > 0) {
                pq.offer(prev);
            }

            sb.append(cur.getKey());
            cur.setValue(cur.getValue() - 1);

            prev = cur;
            if(pq.isEmpty() && prev.getValue() > 0) {
                return null;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        // Test code
        System.out.println(solution("aabb"));
        System.out.println(solution("aaaaabccd"));
        System.out.println(solution("aaca"));
    }
}
