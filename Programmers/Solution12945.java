package programers;

/**
 * packageName    : programers
 * fileName       : Solution12945
 * author         : Hansu
 * date           : 2023-06-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-19        shn81       최초 생성
 * 피보나치 수
 */
public class Solution12945 {
    static int solution(int n) {
        int[] answer = new int[n + 1];

        for(int i = 0; i <= n; i++) {
            if(i == 0) {
                answer[i] = 0;
            } else if(i == 1) {
                answer[i] = 1;
            } else {
                int sum = answer[i - 2] + answer[i - 1];
                answer[i] = sum % 1234567;
            }
        }

        return answer[n];
    }


    public static void main(String[] args) {
        System.out.println(solution(3));
        System.out.println(solution(5));
    }
}
