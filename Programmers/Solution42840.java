package programers;

import java.util.*;

/**
 * packageName    : programers
 * fileName       : Solution42840
 * author         : Hansu
 * date           : 2023-06-11
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-11        shn81       최초 생성
 * 모의고사
 */
public class Solution42840 {
    public static int[] solution(int[] answers) {
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] scores = {0, 0, 0};
        for(int i = 0; i < answers.length; i++) {
            if (first[i % 5] == answers[i]) scores[0]++;
            if (second[i % 8] == answers[i]) scores[1]++;
            if (third[i % 10] == answers[i])  scores[2]++;
        }
        int max = Math.max(Math.max(scores[0], scores[1]), scores[2]);
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < scores.length; i++) {
            if(scores[i] == max) list.add(i + 1);
        }
        return list.stream().mapToInt(Integer :: intValue).toArray();
    }

    public static void main(String[] args) {
        int[] answers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solution(answers)));

        int[] answers2 = {1, 3, 2, 4, 2};
        System.out.println(Arrays.toString(solution(answers2)));
    }
}
