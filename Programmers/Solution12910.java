package programers;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * packageName    : programers
 * fileName       : Solution12910
 * author         : Hansu
 * date           : 2023-06-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-06        shn81       최초 생성
 * 나누어 떨어지는 숫자 배열
 */
public class Solution12910 {
    public static int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int n : arr) {
            if(n % divisor == 0) {
                list.add(n);
            }
        }
        if(list.isEmpty()) {return new int[] {-1};}
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {5, 9, 7, 10}, 5)));
    }
}
