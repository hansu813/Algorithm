package programers;

/**
 * packageName    : programers
 * fileName       : Solution12903
 * author         : Hansu
 * date           : 2023-06-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-07        shn81       최초 생성
 * 가운데 글자 가져오기
 */
public class Solution12903 {
    public static String solution(String s) {
        String answer = "";
        int slen = s.length();
        if(slen % 2 == 0) {
            answer += s.charAt((slen / 2) - 1) + "" + s.charAt((slen / 2));
        } else {
            answer += s.charAt(slen / 2) + "";
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("abcde"));
        System.out.println(solution("qwer"));
    }
}
