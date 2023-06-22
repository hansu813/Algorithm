package programers;

/**
 * packageName    : programers
 * fileName       : Solution12924
 * author         : Hansu
 * date           : 2023-06-22
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-22        shn81       최초 생성
 * 숫자의 표현
 */
public class Solution12924 {
    static int solution(int n) {
        int answer = 0;
        for(int j = 1; j <= n; j++) {
            int targetNum = 0;
            for (int i = j; i <= n; i++) {
                targetNum += i;
                if (targetNum == n) {
                    answer++;
                    break;
                } else if (targetNum > n) {
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(15));
        System.out.println((long)Math.pow(10000, 2)); // 시간복잡도 계산 : N^2
    }
}
