package src.알고리즘.다이나믹프로그래밍;

/**
 * packageName    : src.알고리즘.다이나믹프로그래밍
 * fileName       : Practice01
 * author         : Hansu
 * date           : 2023-06-28
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-28        shn81       최초 생성
 * 정수 n 이 주어졌을 때, 아래의 연산을 통해 1을 만드려고 한다.
 * 2로 나누어 떨어지면 2로 나누기
 * 3으로 나누어 떨어지면 3으로 나누기
 * 1 빼기
 * 위의 연산을 통해 1로 만들 때 필요한 최소한의 연산 횟수를 출력하는 프로그램을 작성하세요.
 */
public class Practice01 {
    static int solution(int n) {
        int[] dp = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + 1;

            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        // Test code
        System.out.println(solution(2));
        System.out.println(solution(4));
        System.out.println(solution(9));
        System.out.println(solution(10));
    }
}
