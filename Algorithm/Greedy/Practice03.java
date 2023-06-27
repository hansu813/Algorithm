package src.알고리즘.그리디알고리즘;

/**
 * packageName    : src.알고리즘.그리디알고리즘
 * fileName       : Practice03
 * author         : Hansu
 * date           : 2023-06-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-27        shn81       최초 생성
 * 양의 정수 배열 prices 가 주어졌다.
 * 각 원소의 의미는 날짜 별 주식 가격을 의맣ㄴ다.
 * 한 번에 한 주만 보유할 수 있다고 할 때 prices 를 보고 사고 팔기를 반복해서
 * 얻을 수 있는 최대 수익을 반환하는 프로그램을 작성하라
 */
public class Practice03 {
    public static int solution(int[] prices) {
        int answer = 0;
        for(int i = 0; i < prices.length - 1; i++) {
            if(prices[i] < prices[i + 1]) {
                answer += Math.abs(prices[i] - prices[i + 1]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] prices = {5, 1, 6, 4, 3, 5};
        System.out.println(solution(prices));

        prices = new int[]{1, 2, 3, 4, 5};
        System.out.println(solution(prices));

        prices = new int[]{5, 4, 3, 2, 1};
        System.out.println(solution(prices));
    }
}
