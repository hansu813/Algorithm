package programers;
/**
 * x가 하샤드 수이려면 x의 자릿수의 합으로
 * x가 나누어 져야 한다.
 * x가 하샤드 수인지 아닌지 검사
 * @author 김한수
 *
 */
public class Solution12947 {

	public static boolean solution(int x) {
		int a = 0;
		int b = x;
		while(b != 0) {
			a += b % 10;
			b /= 10;
		}
		if(x % a == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(13));
	}

}
