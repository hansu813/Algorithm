package programers;

/**
 * packageName    : programers
 * fileName       : Solution12919
 * author         : Hansu
 * date           : 2023-06-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-06        shn81       최초 생성
 * 서울에서 김서방 찾기
 */
public class Solution12919 {
    public static String solution(String[] seoul) {
        int findN = 0;
        for(int i = 0; i < seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                findN = i;
                break;
            }
        }
        return "김서방은 " + findN + "에 있다";
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[] {"Jane", "Kim"}));
    }
}
