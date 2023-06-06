package programers;

/**
 * packageName    : programers
 * fileName       : Solution12934
 * author         : Hansu
 * date           : 2023-06-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-06        shn81       최초 생성
 * 정수 제곱근 판별
 */
public class Solution12934 {
    public static long solution(long n) {
        long answer = 0;
        double nxn = Math.sqrt(n);
        if(nxn % 1 != 0) {
            answer = -1;
        } else {
            answer = (long)Math.pow(nxn + 1, 2);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(121));
        System.out.println(solution(3));
    }
}
