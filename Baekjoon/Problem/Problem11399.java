package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : baekjoon
 * fileName       : Problem11399
 * author         : Hansu
 * date           : 2023-07-04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-07-04        shn81       최초 생성
 * ATM - 실버4
 */
public class Problem11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] countingTable = new int[1001];


        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        for (int i = 0; i < n; i++) {
            int target = Integer.parseInt(st.nextToken());
            countingTable[target]++;
        }

        int sum = 0;
        int prev = 0;
        for (int i = 1; i < countingTable.length; i++) {
            while (countingTable[i] != 0) {
                countingTable[i]--;
                sum += i + prev;
                prev += i;
            }
        }

        System.out.println(sum);
    }
}
