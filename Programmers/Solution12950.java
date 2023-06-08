package programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * packageName    : programers
 * fileName       : Solution12950
 * author         : Hansu
 * date           : 2023-06-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-08        shn81       최초 생성
 */
public class Solution12950 {
    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int col = arr1.length;
        int row = arr1[0].length;
        int[][] answer = new int[col][row];
        for(int i = 0; i < col; i++) {
            for(int j = 0; j < row; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] arr1 = {{1, 2}, {2, 3}};
        int[][] arr2 = {{3, 4}, {5, 6}};
    }
}
