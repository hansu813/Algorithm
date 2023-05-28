package mathBasic;
/**
 * 카탈랑 수는 0번, 1번, 2번,... 순으로 아래와
 * 같이 구성 되는 수열을 의미한다.
 * - 1, 1, 2, 5, 14, 42, 132, 429,...
 * @author 김한수
 *
 */
public class Practice6 {
	public static int solution(int n) {
		int result = 0;
		
		if(n <= 1) {
			return 1;
		}
		
		for(int i = 0; i < n; i++) {
			result += solution(i) * solution(n - i - 1);
		}
		
		return result;
	}
		
	public static void main(String[] args) {
		System.out.println(solution(0));
		System.out.println(solution(2));
		System.out.println(solution(5));
		System.out.println(solution(7));
	}
}
