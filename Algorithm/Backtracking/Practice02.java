package src.알고리즘.백트래킹;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * packageName    : src.알고리즘.백트래킹
 * fileName       : Practice02
 * author         : Hansu
 * date           : 2023-06-30
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-30        shn81       최초 생성
 * 연습문제
 * 숫자 7193은 7193도 소수이고,
 * 719, 71, 7 도 각각 소수이다.
 * n이 주어졌을 때, n 자리 수 중 위와 같은 소수를 찾는 프로그램을 작성
 */
public class Practice02 {
    public static ArrayList<Integer> result;

    static ArrayList<Integer> solution(int n) {
        result = new ArrayList<>();

        int[] primeNum = {2, 3, 5, 7};
        for (int i = 0; i < primeNum.length; i++) {
            backTracking(primeNum[i], 1, n);
        }
        return result;
    }

    static void backTracking(int prime, int len, int n) {
        if (len >= n) {
            result.add(prime);
            return;
        }
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0 || i != 5) {
                int primeCandidate = prime * 10 + i;
                if (isPrimeNum(primeCandidate)) {
                    backTracking(primeCandidate, len + 1, n);
                }
            }
        }
    }

    static boolean isPrimeNum(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //Test code
        System.out.println(solution(3));
        System.out.println(solution(4));
    }
}
