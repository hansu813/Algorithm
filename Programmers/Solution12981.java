package programers;

import java.util.*;

/**
 * packageName    : programers
 * fileName       : Solution12981
 * author         : Hansu
 * date           : 2023-06-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-20        shn81       최초 생성
 */
public class Solution12981 {
    static int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        List<String> list = new ArrayList<>();
        for(int i = 0; i < words.length; i++) {
            if(list.contains(words[i])) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }
            list.add(words[i]);
            if(i != 0 && words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        System.out.println(Arrays.toString(solution(3, words)));
    }
}
