package programers;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * packageName    : programers
 * fileName       : Solution138477
 * author         : Hansu
 * date           : 2023-06-11
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-11        shn81       최초 생성
 * 명예의 전당(1)
 */
public class Solution138477 {
    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            if(i < k) {
                list.add(score[i]);
                list = list.stream().sorted().collect(Collectors.toList());
                answer[i] = list.get(0);
            } else {
                if(list.get(0) < score[i]) {
                    list.remove(0);
                    list.add(score[i]);
                    list = list.stream().sorted().collect(Collectors.toList());
                }
                answer[i] = list.get(0);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {10, 100, 20, 150, 1, 100, 200};
        System.out.println(Arrays.toString(solution(3, arr)));
    }
}
