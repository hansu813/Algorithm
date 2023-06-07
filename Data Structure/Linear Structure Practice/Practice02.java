package data_structure.선형자료구조_연습문제;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * packageName    : data_structure.선형자료구조_연습문제
 * fileName       : Practice02
 * author         : Hansu
 * date           : 2023-06-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-07        shn81       최초 생성
 * 정수로 이루어진 M x N 행렬 데이터가 있다.
 * 행렬의 원소 중 0이 있을 경우 해당 원소가 이치하는 행과 열 전체 데이터를 0으로
 * 변경하는 코드를 작성하시오.
 */
public class Practice02 {
//    public static void solution(int[][] arr) {
//        List<Integer> list1 = new ArrayList();
//        List<Integer> list2 = new ArrayList();
//        for(int i = 0; i < arr.length; i++) {
//            for(int j = 0; j < arr[i].length; j++) {
//                if(arr[i][j] == 0) {
//                    list1.add(i);
//                    list2.add(j);
//                }
//            }
//        }
//        for(int i = 0; i < list1.size(); i++) {
//            for(int j = 0; j < arr[0].length; j++){
//                arr[list1.get(i)][j] = 0;
//            }
//        }
//        for(int i = 0; i < list2.size(); i++) {
//            for(int j = 0; j < arr.length; j++){
//                arr[j][list2.get(i)] = 0;
//            }
//        }
//        for(int i = 0; i < arr.length; i++) {
//            System.out.println(Arrays.toString(arr[i]));
//        }
//    }

    public static void solution(int[][] arr) {
        boolean frZero = false;
        boolean fcZero = false;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == 0) {
                    if(i == 0) {
                        frZero = true;
                    }
                    if(j == 0) {
                        fcZero = true;
                    }
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }

        for(int i = 1; i < arr.length; i++) {
            for(int j = 1; j < arr[i].length; j++) {
                if(arr[i][0] == 0 || arr[0][j] == 0) {
                    arr[i][j] = 0;
                }
            }
        }
        if(frZero) {
            for(int i = 0; i < arr[0].length; i++) {
                arr[0][i] = 0;
            }
        }
        if(fcZero) {
            for(int i = 0; i < arr[0].length; i++) {
                arr[i][0] = 0;
            }
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        solution(arr);


        System.out.println();
        int[][] arr1 = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};
        solution(arr1);
    }
}
