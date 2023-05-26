package programers;

public class Solution131705 {
	
	
	static int solution(int[] number) {
		int answer = 0;
		for(int i = 0; i < number.length; i++) {
			int sum = 0;
			for(int j = i + 1; j < number.length; j++) {
				for(int k = j + 1; k < number.length; k++) {
					sum = number[i] + number[j] + number[k];
					if(sum == 0) {
						answer ++;
					}
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] {-3, -2, -1, 0, 1, 2, 3}));
	}

}
