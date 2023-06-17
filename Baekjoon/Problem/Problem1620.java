package baekjoon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * packageName    : baekjoon
 * fileName       : Problem1620
 * author         : Hansu
 * date           : 2023-06-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-17        shn81       최초 생성
 * 나는야 포켓몬 마스터 이다솜
 */
public class Problem1620 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int listCnt = in.nextInt();
        int resultCnt = in.nextInt();
        Map<Integer, String> integerKey = new HashMap<>();
        Map<String, Integer> stringKey = new HashMap<>();
        for(int i = 1; i <= listCnt; i++) {
            String str = in.next();
            integerKey.put(i, str);
            stringKey.put(str, i);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < resultCnt; i++) {
            String str = in.next();
            try {
                int n = Integer.parseInt(str);
                sb.append(integerKey.get(n)).append('\n');
            } catch(NumberFormatException e) {
                sb.append(stringKey.get(str)).append('\n');
            }
        }
        System.out.println(sb);
    }
}
