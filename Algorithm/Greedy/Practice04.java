package src.알고리즘.그리디알고리즘;

/**
 * packageName    : src.알고리즘.그리디알고리즘
 * fileName       : Practice04
 * author         : Hansu
 * date           : 2023-06-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-27        shn81       최초 생성
 * 양의 정수 n 이 주어지고 다음의 연산을 수행할 수 있을 때,
 * 1. n이 짝수인 경우 2로 나누기 연산
 * 2. n이 홀수인 경우 1을 더하거나 1을 빼는 연산
 * 주어진 n이 1이 되는데 필요한 최소한의 연산 횟수를 반환하세요.
 */
public class Practice04 {
    public static int solution(int n) {
        int cnt = 0;
        while (n != 1) {
            if (n == 3) {
                cnt += 2;
                break;
            }
            if (n % 2 == 0) {
                n /= 2;
            } else if ((n + 1) % 4 == 0) {
                n += 1;
            } else if ((n - 1) % 4 == 0) {
                n -= 1;
            }
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(solution(8));
        System.out.println(solution(7));
        System.out.println(solution(9));
        System.out.println(solution(6));
    }
}
