package programers;
/**
 * 머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
 * 구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.
 * @author 김한수
 *
 */
public class Solution120818 {
	
	public static int solution(int price) {
		int answer = price;
		if(price >= 100000 && price < 300000) {
			answer = (int) (price * 0.95);
		} else if(price >= 300000 && price < 500000) {
			answer = (int) (price * 0.9);
		} else if(price >= 500000) {
			answer = (int) (price * 0.8);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(150000));
		System.out.println(solution(580000));
	}

}
