package programers;
/**
 * 사분면
 * @author 김한수
 *
 */
public class Solution120841 {
	public static int solution(int[] dot) {
		int x = dot[0];
		int y = dot[1];
		if(x > 0) {
			if(y > 0) {
				return 1;
			} else {
				return 4;
			}
		} else {
			if(y > 0) {
				return 2;
			} else {
				return 3;
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] {2, 4}));
		System.out.println(solution(new int[] {-7, 9}));
	}
}
