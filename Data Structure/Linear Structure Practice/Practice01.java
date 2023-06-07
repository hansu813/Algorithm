package data_structure.선형자료구조_연습문제;

import java.util.Arrays;

/**
 * packageName    : data_structure.선형자료구조_연습문제
 * fileName       : Practice01
 * author         : Hansu
 * date           : 2023-06-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-07        shn81       최초 생성
 * 과거에 modification 함수를 이용해 내 데이터의 순서를 변경했었다.
 * 최근 이 변경한 데이터들을 원래의 배열 순서로 변경해야 하는 일이 생겼다.
 * 아래의 modification 코드를 분석한 후 되돌리는 코드를 작성하세요.
 */
public class Practice01 {
    public static int[] modification(int[] arr) {
        int[] arrNew = new int[arr.length];

        int idx = 0;
        int cnt = 0;
        int val = arr[idx];

        while (cnt < arr.length) {
            while (val == 0) {
                idx = (idx + 1) % arr.length;
                val = arr[idx];
            }
            arrNew[cnt++] = val;
            arr[idx] = 0;
            idx = (val + idx) % arr.length;
            val = arr[idx];
        }
        return arrNew;
    }

    public static int[] beforeMod(int[] arr) {
        int[] arrNew = new int[arr.length];

        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(arrNew[index] == 0) {
                    break;
                }
                index = (index + 1) % arr.length;
            }
            arrNew[index] = arr[i];
            index = (index + arr[i]) % arr.length;
        }
        return arrNew;
    }

    public static void main(String[] args) {
//      Modification 당시 입출력 샘플
        System.out.println("<< Modification 당시 출력 >>");
        int[] arr1 = {1, 3, 7, 9, 5};
        System.out.println(Arrays.toString(modification(arr1)));
        int[] arr2 = {3, 6, 8, 2};
        System.out.println(Arrays.toString(modification(arr2)));

//      되돌리기 입출력
//      1,3,7,9,5 3,6,8,2
        System.out.println("<< 되돌려진 배열 >>");
        int[] arr3 = {1, 3, 5, 7, 9};
        System.out.println(Arrays.toString(beforeMod(arr3)));
        int[] arr4 = {3, 2, 6, 8};
        System.out.println(Arrays.toString(beforeMod(arr4)));

    }
}
