package programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * packageName    : programers
 * fileName       : Solution12949
 * author         : Hansu
 * date           : 2023-06-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-24        shn81       최초 생성
 */
public class Solution12949 {
    static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr2[0].length; j++) {
                for(int k = 0; k < arr1[0].length; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
