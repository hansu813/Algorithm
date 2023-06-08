package programers;

/**
 * packageName    : programers
 * fileName       : Solution12930
 * author         : Hansu
 * date           : 2023-06-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-08        shn81       최초 생성
 * 이상한 문자 만들기
 */
public class Solution12930 {
    public static String solution(String s) {
        String strLower = s.toLowerCase();
        int cnt = 0;
        String answer = "";
        for(String str : strLower.split("")) {
            if(str.equals(" ")) {
                cnt = 0;
                answer += " ";
                continue;
            }
            if (cnt % 2 == 0) {
                answer += str.toUpperCase();
            } else {
                answer += str;
            }
            cnt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("try hello world"));
    }
}
