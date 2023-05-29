package programers;
/**
 * 자연수 n을 x로 나눈 나머지가 1이 되도록 하는
 * 가장 작은 자연수 x를 return
 * @author 김한수
 *
 */
public class Solution87389 {
	public static int solution(int n) {
		boolean check = true;
		int i = 0;
		int answer = 0;
		while(check) {
			i++;
			if(n % i == 1) {
				answer = i;
				check = false;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(10));
	}
}
