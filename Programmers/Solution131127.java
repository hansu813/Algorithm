package programers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * packageName    : programers
 * fileName       : Solution131127
 * author         : Hansu
 * date           : 2023-07-01
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-07-01        shn81       최초 생성
 */
public class Solution131127 {
    static int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            map.put(want[i], number[i]);
        }
        for (int i = 0; i < discount.length - 10 + 1; i++) {
            Map<String, Integer> tmp = new HashMap<>();
            for (int j = 0; j < 10; j++) {
                tmp.put(discount[i + j], tmp.getOrDefault(discount[i + j], 0) + 1);
            }
            boolean isCheck = true;
            for (String key : map.keySet()) {
                if (map.get(key) != tmp.get(key)) {
                    isCheck = false;
                    break;
                }
            }
            answer += isCheck ? 1 : 0;
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] want = {"banana", "apple", "rice", "pork", "pot" };
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana" };
        System.out.println(solution(want, number, discount));
    }
}
