package programers;

public class Solution134240 {
	public static String solution(int[] food) {
		StringBuilder sb = new StringBuilder();
		int cnt = 0;
		for(int i = 0; i < food.length; i++) {
			cnt = food[i] / 2;
			if(cnt != 0) {
				for(int j = 0; j < cnt; j++) {
					sb.append(i);
				}
			}
		}
		sb.append(0);
		for(int i = food.length - 1; i > 0; i--) {
			cnt = food[i] / 2;
			if(cnt != 0) {
				for(int j = cnt; j > 0; j--) {
					sb.append(i);
				}
			}
		}
		String answer = sb + "";
		return answer;
	}

	public static void main(String[] args) {
		int[] food = {1, 3, 4, 6};
		System.out.println(solution(food));
	}

}
