package mathBasic;
/**
 * 좋은 수의 경우 찾기
 * @author 김한수
 *
 */
public class Practice9 {
	
	final static int limit  = (int)1e9 + 7;
	
	public static int solution(int n) {
		
		return (int) (function(5, (n + 1) / 2) * function(4, n / 2) % limit);
	}
	
	public static long function(long x, long y) {
		if(y == 0) {
			return 1;
		}
		
		long p = function(x, y / 2);
		return p * p * (y % 2 > 0 ? x : 1) % limit;
	}
	
	public static void main(String[] args) {
//		Test Code
		System.out.println(solution(1));
		System.out.println(solution(2));
		System.out.println(solution(3));
		System.out.println(solution(4));
		System.out.println(solution(50));
		System.out.println(solution(100));
	}
}
