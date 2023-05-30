package programers;
/**
 * 전화 번호를 문자열로 입력 받아 뒷 4자리를 제외한
 * 나머지 숫자를 전부 *로 가린 문자열을 리턴
 * @author 김한수
 *
 */
public class Solution12948 {

	public static String solution(String phone_number) {
		String answer = "";
		int length = phone_number.length();
		for(int i = 0; i < length - 4; i++) {
			answer += '*';
		}
		for(int i = 4; i > 0; i--) {
			answer += phone_number.charAt(length - i);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("01033334444"));
	}

}
