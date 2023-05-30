package programers;

import java.util.Arrays;

/**
 * 문자열 배열의 각 원소의 길이를 return
 * @author 김한수
 *
 */
public class Solution120854 {

	public static int[] solution(String[] strlist) {
		int[] answer = new int[strlist.length];
		for(int i = 0; i < answer.length; i++) {
			answer[i] = strlist[i].length();
		}
		return answer;
	}
	
	public static void main(String[] args) {
		String[] strlist = {"We", "are", "the", "world!"};
		System.out.println(Arrays.toString(solution(strlist)));
	}

}
