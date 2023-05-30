package programers;

public class Solution120822 {

	public static String solution(String my_string) {
		StringBuilder sb = new StringBuilder(my_string);
		String answer = sb.reverse().toString();
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution("jaron"));
	}

}
