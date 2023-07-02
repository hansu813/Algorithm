package programers;

/**
 * packageName    : programers
 * fileName       : Solution42584
 * author         : Hansu
 * date           : 2023-07-02
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-07-02        shn81       최초 생성
 * 주식가격 - Lv.2
 */
public class Solution42584 {
    static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                answer[i]++;
                if(prices[i] > prices[j]) {
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
