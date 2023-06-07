/**
 * packageName    : PACKAGE_NAME
 * fileName       : Solution77884
 * author         : Hansu
 * date           : 2023-06-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-07        shn81       최초 생성
 * 약수의 개수와 덧셈
 */
public class Solution77884 {
    public static int solution(int left, int right) {
        int answer = 0;
        int cnt = 0;
        for(int i = left; i <= right; i++) {
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    cnt++;
                }
            }
            if(cnt % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
            cnt = 2;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(13, 17));
        System.out.println(solution(24, 27));
    }
}
