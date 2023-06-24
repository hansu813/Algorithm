package src.알고리즘.정렬;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * packageName    : src.알고리즘.정렬
 * fileName       : Practice03
 * author         : Hansu
 * date           : 2023-06-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-24        shn81       최초 생성
 * 연습문제 3 )
 * intervals 라는 구간으로 이루어진 배열이 주어졌을 때,
 * 오버랩 도니느 구간을 합치는 프로그램을 작성하시오.
 * 합친 구간은 오름차순으로 정렬해서 반환
 */
public class Practice03 {

    public static ArrayList<int[]> solution(int[][] intervals) {
        if (intervals == null || intervals.length < 2) {
            return new ArrayList<>();
        }

        sort(intervals);

        ArrayList<int[]> result = new ArrayList<>();
        int[] curIntervals = intervals[0];
        result.add(curIntervals);

        for (int i = 1; i < intervals.length; i++) {
            if (curIntervals[1] >= intervals[i][0]) {
                curIntervals[i] = intervals[i][1];
            } else {
                curIntervals = intervals[i];
                result.add(curIntervals);
            }
        }
        return result;
    }

    public static void sort(int[][] intervals) {
        quickSort(intervals, 0, intervals.length - 1);
    }

    public static void quickSort(int[][] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot = patition(arr, left, right);

        quickSort(arr, left, pivot - 1);
        quickSort(arr, pivot + 1, right);
    }

    public static int patition(int[][] arr, int left, int right) {
        int pivot = arr[left][0];
        int i = left;
        int j = right;

        while (i < j) {
            while (arr[j][0] > pivot && i < j) {
                j--;
            }
            while (arr[i][0] <= pivot && i < j) {
                i++;
            }

            swap(arr, i, j);
        }
        swap(arr, left, i);

        return i;
    }

    public static void swap(int[][] arr, int i, int j) {
        int[] tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        // Test cdoe
        int[][] intervals = {{2, 6}, {1, 3}, {15, 18}, {8, 10}};

        for(int[] item : solution(intervals)){
            System.out.print(Arrays.toString(item) + " ");
        }
        System.out.println();
    }
}
