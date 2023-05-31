package programers;
/**
 * 배열의 평균 구하기
 * @author 김한수
 *
 */
public class Solution12944 {
	public static double solution(int[] arr) {
		double answer = 0;
		for(int num : arr) {
			answer += num;
		}
		return answer / arr.length;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] {1, 2, 3, 4}));
		System.out.println(solution(new int[] {5,5}));
	}
}
