package src.알고리즘.이진탐색;

import java.util.Arrays;

/**
 * packageName    : src.알고리즘.이진탐색
 * fileName       : Main2
 * author         : Hansu
 * date           : 2023-06-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-24        shn81       최초 생성
 * 자바 기본 binarySearch
 */
public class Main2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 10, 20, 30, 40, 50, 60};

        System.out.println("== 데이터가 있는 경우 ==");
        System.out.println(Arrays.binarySearch(arr, 1));
        System.out.println(Arrays.binarySearch(arr, 10));
        System.out.println(Arrays.binarySearch(arr, 30));

        System.out.println("== 데이터가 없는 경우 ==");
        System.out.println(Arrays.binarySearch(arr, 3));
        System.out.println(Arrays.binarySearch(arr, 11));
        System.out.println(Arrays.binarySearch(arr, 35));
    }
}
