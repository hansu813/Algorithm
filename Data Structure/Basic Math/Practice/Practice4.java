package mathBasic;

import java.util.HashSet;

/**
 * 주어진 양의 정수가 행복한 수 인지 판별
 * 행복한 수
 * => 각 자리 수를 제곱한 것을 더하는 과정을
 * 반복했을 때 1로 끝나는 수
 * @author 김한수
 *
 */
public class Practice4 {
	
	public static boolean solution(int n) {
		HashSet<Integer> set = new HashSet<>();
		
		while(set.add(n)) {
			int squreSum = 0;
			
			while(n > 0) {
				int remain = n % 10;
				squreSum += remain * remain;
				n /= 10;
			}
			
			if(squreSum == 1) {
				return true;
			} else {
				n = squreSum;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(19));
		System.out.println(solution(2));
		System.out.println(solution(61));
	}
}
