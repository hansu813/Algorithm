package programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * packageName    : programers
 * fileName       : Solution135808
 * author         : Hansu
 * date           : 2023-06-11
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-11        shn81       최초 생성
 */
public class Solution135808 {
    public static int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        List<Integer> list = new ArrayList<>();
        for (int i = score.length - 1; i >= 0; i--) {
            list.add(score[i]);
            if (list.size() == m) {
                list = list.stream().sorted().collect(Collectors.toList());
                answer += list.get(0) * m;
                list.clear();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        System.out.println(solution(4, 3, score));
    }
}
