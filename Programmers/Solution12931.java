package programers;

/**
 * packageName    : programers
 * fileName       : Solution12931
 * author         : Hansu
 * date           : 2023-06-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-05        shn81       최초 생성
 */
public class Solution12931 {
    public static int solution(int n) {
        int answer = 0;
        while(n != 0) {
            answer += n % 10;
            n /= 10;
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
//        System.out.println("Hello Java");

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(123));
    }
}
