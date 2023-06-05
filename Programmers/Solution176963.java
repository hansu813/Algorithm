package programers;

import java.util.Arrays;
import java.util.HashMap;

public class Solution176963 {
    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        for(int n : answer) {
            n = 0;
        }
        HashMap<String, Integer> photoMap = new HashMap<>();
        for(int i = 0; i < name.length; i++) {
            photoMap.put(name[i], yearning[i]);
        }
        for(int i = 0; i < photo.length; i++) {
            for(int j = 0; j < photo[i].length; j++) {
                if(photoMap.containsKey(photo[i][j])) {
                    answer[i] += photoMap.get(photo[i][j]);
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        System.out.println(Arrays.toString(solution(name, yearning, photo)));
    }
}
