package programers;

/**
 * packageName    : programers
 * fileName       : Solution12912
 * author         : Hansu
 * date           : 2023-06-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-06        shn81       최초 생성
 * 두 정수 사이의 합
 */
public class Solution12912 {
    public static long solution(int a, int b) {
        long answer = 0;
        if(a >= b) {
            for(int i = b; i <= a; i++) {
                answer += i;
            }
        } else {
            for(int i = a; i <= b; i++) {
                answer += i;
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(3, 5));
        System.out.println(solution(3, 3));
        System.out.println(solution(5, 3));
    }
}
