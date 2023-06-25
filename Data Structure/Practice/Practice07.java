package src.비선형자료구조.연습문제;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * packageName    : src.비선형자료구조.연습문제
 * fileName       : Practice07
 * author         : Hansu
 * date           : 2023-06-25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-25        shn81       최초 생성
 * 연습문제 )
 * 정수형 2차원 배열 intervals 와 정수형 배열 queries 가 주어졌으며 각각의 의미는
 * 다음과 같다.
 * - intervals : 구간의 데이터를 2차원으로 구성
 * - queries : 어떤 값이 intervals 의 구간 내에 포함되어 있는지 확인하기 위한 질문 목록
 * 위와 같은 데이터가 주어졌을 때, 각 query 가 포함될 수 있는 구간 중 최소 구간을 변한하는 프로그램을 작성
 * 반환 값은 종료값 - 시작값 + 1 로 반환
 * 만족하는 구간 없을 시 -1 반환
 */
public class Practice07 {
    public static int[] solution(int[][] intervals, int[] queries) {
        int[] result = new int[queries.length];

        int[][] queriesBak = new int[queries.length][2];
        for (int i = 0; i < queries.length; i++) {
            queriesBak[i] = new int[]{queries[i], i};
        }

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((x, y) -> (x[1] - x[0]) - (y[1] - y[0]));

        Arrays.sort(intervals, (x, y) -> (x[0] - y[0]));
        Arrays.sort(queriesBak, (x, y) -> x[0] - y[0]);

        int j = 0;
        for (int i = 0; i < queries.length; i++) {
            int queryVal = queriesBak[i][0];
            int queryIdx = queriesBak[i][1];

            while (j < intervals.length && intervals[j][0] <= queryVal) {
                minHeap.add(intervals[j]);
                j++;
            }
            while (!minHeap.isEmpty() && minHeap.peek()[1] < queryVal) {
                minHeap.remove();
            }

            result[queryIdx] = minHeap.isEmpty() ? -1 : (minHeap.peek()[1] - minHeap.peek()[0] + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 4}, {2, 4}, {3, 6}, {4, 4}};
        int[] queries = {2, 3, 4, 5};
        System.out.println(Arrays.toString(solution(intervals, queries)));

        intervals = new int[][]{{2, 3}, {2, 5}, {1, 8}, {20, 25}};
        queries = new int[]{2, 19, 5, 22};
        System.out.println(Arrays.toString(solution(intervals, queries)));

    }
}
