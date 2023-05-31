package programers;
/**
 * 콜라츠 추측
 * @author 김한수
 *
 */
public class Solution12943 {
	public static int solution(long num) {
		int cnt = 0;
		while(cnt < 500) {
			if(num == 1) {
				return cnt;
			}
			if(num % 2 == 0) {
				num /= 2;
			} else {
				num = num * 3 + 1;
			}
			cnt ++;
		}
		return -1;
	}
	
	public static void main(String[] args) {
//		System.out.println(solution(6));
//		System.out.println(solution(16));
		System.out.println(solution(626331));
//		System.out.println(solution(1));
//		System.out.println(solution(4515131));
	}
}
