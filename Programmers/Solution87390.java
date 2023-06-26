package programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * packageName    : programers
 * fileName       : Solution87390
 * author         : Hansu
 * date           : 2023-06-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-26        shn81       최초 생성
 */
public class Solution87390 {
//    static int[] solution(int n, long left, long right) { // 메모리 초과 case
//        int[] answer = new int[(int)(right - left)];
//        List<Integer> resultList = new ArrayList<>();
//        int idx = 1;
//        for(int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if(j < i) {
//                    resultList.add(i + 1);
//                } else {
//                    resultList.add(j + 1);
//                }
//            }
//        }
//        return resultList.subList((int)left, (int)right + 1).stream().mapToInt(i -> i).toArray();
//    }

    static long[] solution(int n, long left, long right) {
        List<Long> list = new ArrayList<>();
        for(long i = left; i < right + 1; i++) {
            list.add(Math.max(i / n, i % n) + 1);
        }
        return list.stream().mapToLong(i -> i).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, 2, 5)));
    }
}
