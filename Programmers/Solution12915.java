package programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * packageName    : programers
 * fileName       : Solution12915
 * author         : Hansu
 * date           : 2023-06-09
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-09        shn81       최초 생성
 */
public class Solution12915 {
    public static String[] solution(String[] strings, int n) {
        return Arrays.stream(strings).sorted((a, b) -> {
            if(a.charAt(n) > b.charAt(n)) {
                return 1;
            } else if(a.charAt(n) == b.charAt(n)) {
                return 0;
            }
                return -1;
        })
        .sorted((s1, s2) -> {
            if(s1.charAt(n) == s2.charAt(n)) {
                return s1.compareTo(s2);
            }
            return 0;
        }).toArray(String[] :: new);
    }
    public static void main(String[] args) {
        String[] arr = {"sun", "bed", "car"};
        System.out.println(Arrays.toString(solution(arr, 1)));
    }
}
