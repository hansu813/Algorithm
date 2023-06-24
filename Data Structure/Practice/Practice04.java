package src.비선형자료구조.연습문제;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/**
 * packageName    : src.비선형자료구조.연습문제
 * fileName       : Practice04
 * author         : Hansu
 * date           : 2023-06-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-24        shn81       최초 생성
 * 연습문제 3 )
 * 네 자리 비밀번호를 설정할 수 있는 자물쇠가 주어진다.
 * 원형 바퀴 형태로 숫자를 돌려가며 설정하는 방식이고, 아래오 ㅏ같은 숫자로 구성된다.
 * 0,1,2,3,4,5,6,7,8,9
 * 바퀴의 숫자는 다음과 같이 전후 이동이 가능하다.
 * 9 -> 0, 0 -> 9 가능
 * 자물쇠의 처음은 0000으로 시작하고 deadends 목록과 target 이 주어진다.
 * 자물쇠를 몇번 이동시키면 target에 도달하는지 계산하는 프로그램을 작성
 */
public class Practice04 {
    public static int solution(String[] deadends, String target) {
        HashSet<String> visited = new HashSet<>(Arrays.asList(deadends));

        Queue<String> queue = new LinkedList<>();

        queue.offer("0000");
        int cnt = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String curNum = queue.poll();

                if(!visited.add(curNum)) {
                    continue;
                }
                if(curNum.equals(target)) {
                    return cnt;
                }
                for(String nextNum : getNextNums(curNum.toCharArray())) {
                    if(!visited.contains(nextNum)) {
                        queue.offer(nextNum);
                    }
                }
            }
            cnt++;
        }

        return cnt;
    }

    public static LinkedList<String> getNextNums(char[] cArr) {
        LinkedList<String> nums = new LinkedList<>();
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            cArr[i] = c == '9' ? '0' : (char) (c + (char) 1);
            nums.add(String.valueOf(cArr));
            cArr[i] = c == '0' ? '9' : (char) (c - (char) 1);
            nums.add(String.valueOf(cArr));
            cArr[i] = c;
        }
        return nums;
    }

    public static void main(String[] args) {
        String[] deadends = {"0201", "0101", "0102", "1212", "2002"};
        System.out.println(solution(deadends, "0202"));
    }
}
