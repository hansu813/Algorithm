package programers;

/**
 * packageName    : programers
 * fileName       : Solution68935
 * author         : Hansu
 * date           : 2023-06-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-08        shn81       최초 생성
 * 3진법 뒤집기
 */
public class Solution68935 {
    public static int solution(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(n, 3));
        int answer = Integer.parseInt(sb.reverse().toString(), 3);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(45));
    }
}
