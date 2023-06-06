package programers;

/**
 * packageName    : programers
 * fileName       : Solution12916
 * author         : Hansu
 * date           : 2023-06-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-06        shn81       최초 생성
 * 문자열 내 p와 y의 개수
 */
public class Solution12916 {
    public static boolean solution(String s) {
        String upperStr = s.toUpperCase();
        int pCnt = 0;
        int yCnt = 0;
        for(char c : upperStr.toCharArray()) {
            if(c == 'P') {
                pCnt++;
            }
            if(c == 'Y') {
                yCnt++;
            }
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        if(pCnt == yCnt) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution("pPoooyY"));
        System.out.println(solution("Pyy"));
    }
}
