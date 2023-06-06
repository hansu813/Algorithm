package programers;

/**
 * packageName    : programers
 * fileName       : Solution12925
 * author         : Hansu
 * date           : 2023-06-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-06        shn81       최초 생성
 * 문자열을 정수로 바꾸기
 */
public class Solution12925 {
    public static int solution(String s) {
        int answer = Integer.parseInt(s);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("1234"));
        System.out.println(solution("-1234"));
    }
}
