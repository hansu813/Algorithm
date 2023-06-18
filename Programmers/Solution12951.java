package programers;


/**
 * packageName    : programers
 * fileName       : Solution12951
 * author         : Hansu
 * date           : 2023-06-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-18        shn81       최초 생성
 * JadenCase 문자열 만들기
 */
public class Solution12951 {
    static String solution(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        sb.append((s.charAt(0) + "").toUpperCase());
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i - 1) == ' ') {
                sb.append((s.charAt(i) + "").toUpperCase());
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("3people unFollowed me"));
        System.out.println(solution("for the last week"));
    }
}
