package src.알고리즘.백트래킹;

import java.util.Arrays;

/**
 * packageName    : src.알고리즘.백트래킹
 * fileName       : Practice01
 * author         : Hansu
 * date           : 2023-06-30
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-30        shn81       최초 생성
 * 연습 문제
 * 정수형 n과 m이 주어졌을 때,
 * 1부터 n 까지의 정수 중에서 중복 없이 m개를 고른 수열을 출력하는 프로그램을 작성
 */
public class Practice01 {
    public static boolean[] visited;
    public static int[] out;

    static void solution(int n, int m) {
        visited = new boolean[n];
        out = new int[m];
        permutation(n, m, 0);
    }

    static void permutation(int n, int m, int depth) {
        if(depth == m) {
            System.out.println(Arrays.toString(out));
            return;
        }

        for(int i = 0; i < n; i++) {
            if(!visited[i]) {
                visited[i] = true;
                out[depth] = i + 1;
                permutation(n, m, depth + 1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        // Test code
        solution(3, 2);
        System.out.println();
        solution(4, 3);
    }
}
