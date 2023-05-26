package programers;


public class Solution131128 {

	static String solution(String X, String Y) {
		StringBuilder sb = new StringBuilder();
		int[] x = new int[10];
		int[] y = new int[10];
		for(int i = 0; i < X.length(); i++) {
			x[X.charAt(i) - '0']++;
		}
		for(int i = 0; i < Y.length(); i++) {
			y[Y.charAt(i) - '0']++;
		}
		for(int i = 9; i >= 0; i--) {
			for(int j = 0; j < Math.min(x[i], y[i]); j++) {
				sb.append(i);
			}
		}
		String answer = sb.toString();
		
		if(answer.isEmpty()) {
			return "-1";
		}else if(answer.charAt(0) == '0') {
			return "0";
		} else {
			return answer;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(solution("5525", "1255"));
	}

}
