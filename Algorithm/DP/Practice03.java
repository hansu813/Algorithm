package src.알고리즘.다이나믹프로그래밍;

/**
 * packageName    : src.알고리즘.다이나믹프로그래밍
 * fileName       : Practice03
 * author         : Hansu
 * date           : 2023-06-28
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-28        shn81       최초 생성
 * 배낭에 물품을 담으려 한다.
 * 배낭에는 k 무게 만큼의 물품을 담을 수 있다.
 * n 개의 물품이 주어지고 이 물품의 무게와 가치 정보가 items 2차원 배열에 주어졌을 때,
 * 최대 가치가 되도록 물품을 담았을 때의 가치를 출력하는 프로그램
 */
public class Practice03 {
    static int solution(int[][] item, int n, int k) {
        int[][] dp = new int[n + 1][k + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= k; j++) {
                if (item[i][0] > j) {
                    dp[i + 1][j] = dp[i][j];
                } else {
                    dp[i + 1][j] = Math.max(dp[i][j], dp[i][j - item[i][0]] + item[i][1]);
                }
            }
        }
        return dp[n][k];
    }

    public static void main(String[] args) {
        // Test code
        int[][] item = {{6, 13}, {4, 8}, {3, 6}, {5, 12}};
        System.out.println(solution(item, 4, 7));
    }
}
