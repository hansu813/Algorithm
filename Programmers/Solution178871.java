package programers;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;

/**
 * 달리기 경주
 *
 * @author 김한수
 */
public class Solution178871 {
    public static String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> rankMap = new HashMap<>();
        for(int i = 0; i < players.length; i++) {
            rankMap.put(players[i], i);
        }
        for(String s : callings) {
            int cntRank = rankMap.get(s);
            String frontPlayer = players[cntRank - 1];

            players[cntRank - 1] = s;
            players[cntRank] = frontPlayer;

            rankMap.put(s, cntRank - 1);
            rankMap.put(frontPlayer, cntRank);
        }
        return players;
    }


    public static void main(String[] args) {
        System.out.println((Arrays.toString(solution(new String[]{"mumu", "soe", "poe", "kai", "mine"}, new String[]{"kai", "kai", "mine", "mine"}))));
    }
}
