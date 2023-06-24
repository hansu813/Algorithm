package src.알고리즘.정렬;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/**
 * packageName    : src.알고리즘.정렬
 * fileName       : Main6
 * author         : Hansu
 * date           : 2023-06-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-24        shn81       최초 생성
 * 계수 정렬
 */
public class Main6 {
    public static void countingSort(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        int[] cntArr = new int[max + 1];

        for (int i = 0; i < arr.length; i++) {
            cntArr[arr[i]]++;
        }

        int idx = 0;
        for (int i = 0; i < cntArr.length; i++) {
            arr[idx++] = i;
            cntArr[i]--;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int item : arr) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }

        int idx2 = 0;
        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);

        for(int i = 0; i < list.size(); i++) {
            int cnt = map.get(list.get(i));
            cnt--;
        }
    }

    public static void main(String[] args) {
        // Test code
        int[] arr = {10, 32, 10, 27, 32, 19, 99, 56};
        countingSort(arr);
        System.out.println("계수 정렬 : " + Arrays.toString(arr));
    }
}
