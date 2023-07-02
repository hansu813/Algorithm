package src.알고리즘.연습문제;

import java.util.Arrays;

/**
 * packageName    : src.알고리즘.연습문제
 * fileName       : Practice01
 * author         : Hansu
 * date           : 2023-07-02
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-07-02        shn81       최초 생성
 * 치과 병원에 n 명의 환자가 진료를 위해 대기 중이다.
 * 병원에는 k 명의 의사가 있고 의사마다 진료 시간이 다르다.
 * k 명의 의사가 진료하는데 걸리는 시간은 times 배열에 주어진다.
 * 한 치과 의사에게는 한번에 한명의 환자가 진료를 받을 수 있으며,
 * 대기하고 있는 환자들은 순서대로 진료가 끝난 희사에게 가서 진료를 받는다.
 * 모든 환자가 진료를 받는데 걸리는 최소한의 시간을 구하는 프로그램을 작성하시오.
 */
public class Practice01 {
    public static int solution(int n, int[] times) {
        Arrays.sort(times);
        int left = 0;
        int right = times[times.length - 1] * n;
        while (left <= right) {
            int mid = (left + right) / 2;

            int cnt = 0;
            for (int i = 0; i < times.length; i++) {
                cnt += mid / times[i];
            }

            if (cnt < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        // Test case
        int n = 6;
        int[] times = {7, 10};
        System.out.println(solution(n, times));
    }
}
