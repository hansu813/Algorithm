package programers;

/**
 * packageName    : programers
 * fileName       : Solution12926
 * author         : Hansu
 * date           : 2023-06-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-08        shn81       최초 생성
 * 시저 암호
 */
public class Solution12926 {
    public static String solution(String s, int n) {
        String alphaSmall = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
        String alphaBig = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                sb.append(" ");
            }
            int idx = 0;
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                idx = alphaSmall.indexOf(s.charAt(i));
                sb.append(alphaSmall.charAt(idx + n));
            }
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                idx = alphaBig.indexOf(s.charAt(i));
                sb.append(alphaBig.charAt(idx + n));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("AB", 1));
        System.out.println(solution("z", 1));
        System.out.println(solution("a B z", 4));
    }
}
