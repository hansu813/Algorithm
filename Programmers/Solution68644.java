package programers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * packageName    : programers
 * fileName       : Solution68644
 * author         : Hansu
 * date           : 2023-06-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-10        shn81       최초 생성
 * 두 개 뽑아서 더하기
 */
public class Solution68644 {
    public static int[] solution(int[] numbers) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0; i < numbers.length - 1; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                int n = numbers[i] + numbers[j];
                set.add(n);
            }
        }
        int[] answer = new int[set.size()];
        int cnt = 0;
        for(int n : set) {
            answer[cnt++] = n;
        }
        return answer;
    }

    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        set.add(100);
        set.add(12);
        set.add(151);
        set.add(11);
        System.out.println(set);
    }
}
