package programers;

import java.util.*;

/**
 * packageName    : programers
 * fileName       : Solution42576
 * author         : Hansu
 * date           : 2023-06-13
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-13        shn81       최초 생성
 * 완주하지 못한 선수
 *
 * 문제를 끝까지 보지 않고 해시셋을 이용한 차집합을 사용했다가 틀렸다.
 * 아래 해당 방법은 포기, 쉬운 방법으로 다시 생각.
 */
public class Solution42576 {
//    public static String solution(String[] participant, String[] completion) {
//        Set<String> setA = new HashSet<>();
//        Set<String> setB = new HashSet<>();
//        for(int i = 0; i < participant.length; i++) {
//            if(setA.contains(participant[i])) {
//                setA.add(participant[i] + i);
//            } else {
//                setA.add(participant[i]);
//            }
//        }
//        for(int i = 0; i < completion.length; i++) {
//            if(setB.contains(completion[i])) {
//                setB.add(completion[i] + i);
//            } else {
//                setB.add(completion[i]);
//            }
//        }
//        setA.removeAll(setB);
//        return setA.toString().replaceAll("[0-9]|\\[|\\]","");
//    }

    public static String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        for(String part : participant) {
            if(map.containsKey(part)) {
                map.put(part, map.get(part) + 1);
            } else {
                map.put(part, 1);
            }
        }
        for(String com : completion) {
            map.put(com, map.get(com) - 1);
        }
        String answer = "";
        for(String key : map.keySet()) {
            if(map.get(key) == 1) {
                answer = key;
                break;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        System.out.println(solution(participant, completion));

        participant = new String[] {"marina", "josipa", "nikola", "vinko", "filipa"};
        completion = new String[] {"josipa", "filipa", "marina", "nikola"};
        System.out.println(solution(participant, completion));

        participant = new String[] {"mislav", "stanko", "mislav", "ana"};
        completion = new String[] {"stanko", "ana", "mislav"};
        System.out.println(solution(participant, completion));

    }
}
