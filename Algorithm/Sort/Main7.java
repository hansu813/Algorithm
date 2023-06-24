package src.알고리즘.정렬;

import java.util.Arrays;

/**
 * packageName    : src.알고리즘.정렬
 * fileName       : Main7
 * author         : Hansu
 * date           : 2023-06-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-24        shn81       최초 생성
 * 셸 정렬
 */
public class Main7 {
    public static void shellSort(int[] arr) {
        int gap = arr.length / 2;

        for (int g = gap; g > 0; g /= 2) {
            for (int i = 0; i < arr.length; i++) {
                int tmp = arr[i];

                int j = 0;
                for (j = i - g; j >= 0; j -= g) {
                    if (arr[j] > tmp) {
                        arr[j + g] = arr[j];
                    } else {
                        break;
                    }
                }
                arr[j + g] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        // Test code
        int[] arr = {10, 32, 52, 27, 48, 17, 99, 56};
        shellSort(arr);
        System.out.println("쉘 정렬 : " + Arrays.toString(arr));
    }
}
