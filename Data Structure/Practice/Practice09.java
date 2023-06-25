package src.비선형자료구조.연습문제;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * packageName    : src.비선형자료구조.연습문제
 * fileName       : Practice09
 * author         : Hansu
 * date           : 2023-06-25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-25        shn81       최초 생성
 * 정수 n 과 k 와 정수형 배열 speed, efficiency 가 주어졌고 각각의 의미는 다음과 같다.
 * - n : 총 작업자 수
 * - k : 일할 수 있는 작업자 수
 * - speed : n 명이ㅡ 작업자 각각의 작업 속도 정보
 * - efficiency : n 명의 작업자 각각의 작업 효율 정보
 * k 명의 작업자를 선택할 때, 가장 작업 성능이 뛰어나게 구성하는 프로그램을 작성
 * 작업 성능은 k 명의 작업 속도 합에 그 중 효율이 가장 낮은 값을 곱해서 구한다.
 */
public class Practice09 {
    public static int solution(int n, int k, int[] speed, int[] efficiency) {
        int[][] engineers = new int[n][2];
        for (int i = 0; i < n; i++) {
            engineers[i] = new int[]{efficiency[i], speed[i]};
        }
        Arrays.sort(engineers, (x, y) -> y[0] - x[0]);

        PriorityQueue<Integer> pq = new PriorityQueue<>(k, (x, y) -> x - y);
        int sum = 0;
        int result = 0;
        for (int[] engineer : engineers) {
            pq.offer(engineer[1]);
            sum += engineer[1];

            if (pq.size() > k) {
                sum -= pq.poll();
            }
            result = Math.max(result, (sum * engineer[0]));
        }
        return result;
    }

    public static void main(String[] args) {
        int[] speed = {2, 10, 3, 1, 5, 8};
        int[] efficiency = {5, 4, 3, 9, 7, 2};
        System.out.println(solution(6, 2, speed, efficiency));
        System.out.println(solution(6, 3, speed, efficiency));
        System.out.println(solution(6, 4, speed, efficiency));
    }
}
