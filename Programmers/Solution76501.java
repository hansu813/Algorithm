package programers;

/**
 * packageName    : programers
 * fileName       : Solution76501
 * author         : Hansu
 * date           : 2023-06-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-06        shn81       최초 생성
 * 음양 더하기
 */
public class Solution76501 {
    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i = 0; i < absolutes.length; i++) {
            if(signs[i] == false) {
                absolutes[i] *= -1;
            }
        }
        for(int n : absolutes) {
            answer += n;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] absolute = {4, 7, 12};
        boolean[] signs = {true, false, true};
        System.out.println(solution(absolute, signs));
    }
}
