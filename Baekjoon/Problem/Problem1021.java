package baekjoon;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * packageName    : baekjoon
 * fileName       : Problem1021
 * author         : Hansu
 * date           : 2023-06-13
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-13        shn81       최초 생성
 * 회전하는 큐
 */
public class Problem1021 {
    public static void main(String[] args) {
        int cnt = 0;
        LinkedList<Integer> deque = new LinkedList<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // 전체 리스트
        int m = in.nextInt(); // 지민이가 뽑아낼 수
        for (int i = 1; i <= n; i++) {
            deque.offer(i);
        }
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = in.nextInt();
        }
        for(int i = 0; i < m; i++) {
            int targetIdx = deque.indexOf(arr[i]);
            int half_idx;
            if(deque.size() % 2 == 0) {
                half_idx = deque.size() / 2 - 1;
            } else {
                half_idx = deque.size() / 2;
            }
            if(targetIdx <= half_idx) {
                for(int j = 0; j < targetIdx; j++) {
                    int tmp = deque.pollFirst();
                    deque.offerLast(tmp);
                    cnt++;
                }
            } else {
                for(int j = 0; j < deque.size() - targetIdx; j++) {
                    int tmp = deque.pollLast();
                    deque.offerFirst(tmp);
                    cnt++;
                }
            }
            deque.pollFirst();
        }
        System.out.println(cnt);
    }
}
