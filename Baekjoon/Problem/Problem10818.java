package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * packageName    : baekjoon
 * fileName       : Problem10818
 * author         : Hansu
 * date           : 2023-06-14
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-14        shn81       최초 생성
 */
public class Problem10818 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] array = new int[N];
        for(int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        in.close();
        Arrays.sort(array);
        System.out.println(array[0] + " " + array[array.length - 1]);
    }
}
