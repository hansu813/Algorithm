package programers;

public class Solution86051 {

	public static int solution(int[] numbers) {
		int answer = 0;
		int[] ten = new int[10];
		for(int i = 0; i < numbers.length; i++) {
			ten[numbers[i]]++;
		}
		for(int i = 0; i < ten.length; i++) {
			if(ten[i] == 0) {
				answer += i;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] {1, 2, 3, 4, 6, 7, 8, 0}))
		;
	}

}
