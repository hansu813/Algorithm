package programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * packageName    : programers
 * fileName       : Solution12985
 * author         : Hansu
 * date           : 2023-06-22
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-22        shn81       최초 생성
 */
public class Solution12985 {
    static int solution1(int n, int a, int b) { // 시간초과
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            list.add(i);
        }
        boolean isCheck = true;
        while (isCheck) {
            answer++;
            for (int i = 0; i < list.size() - 1; i++) {
                if(list.get(i) == a && list.get(i + 1) == b || list.get(i) == b && list.get(i + 1) == a) {
                    isCheck = false;
                } else {
                    if(list.get(i) == a || list.get(i + 1) == a) {
                        list.set(i, a);
                        list.remove(i + 1);
                    } else if(list.get(i) == b || list.get(i + 1) == b) {
                        list.set(i, b);
                        list.remove(i + 1);
                    } else {
                        list.remove(i + 1);
                    }
                }
            }
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }

    static int solution2(int n, int a, int b) {
        int answer = 0;
        while (true) {
            a = a / 2 + a % 2;
            b = b / 2 + b % 2;
            answer++;
            if(a == b) {
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution1(8, 4, 7));
    }
}
