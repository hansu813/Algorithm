package programers;

/**
 * packageName    : programers
 * fileName       : Solution82612
 * author         : Hansu
 * date           : 2023-06-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-07        shn81       최초 생성
 * 부족한 금액 계산하기
 */
public class Solution82612 {
    public static long solution(int price, int money, int count) {
        long needMoney = 0;
        for(int i = 1; i <= count; i++) {
            needMoney += price * i;
        }
        if(money > needMoney) {
            return 0;
        } else {
            return needMoney - money;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(3, 20, 4));
    }
}
