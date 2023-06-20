package baekjoon;

import java.util.Scanner;

/**
 * packageName    : baekjoon
 * fileName       : Problem10807
 * author         : Hansu
 * date           : 2023-06-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-19        shn81       최초 생성
 * 개수 세기
 */
public class Problem10807 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = in.nextInt();
        }

        int target = in.nextInt();
        in.close();
        int cnt = 0;

        for (int item : array) {
            if (item == target) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
