package mathBasic;
/**
 * 팰린드롬(palindrome)은 앞 뒤 방향으로 같은 순서의 문자로
 * 구성된 문자열을 말한다.
 * Ex ) abba, kayak, madam
 * 
 * 유사 회문은 문자열 그 자체는 회문이 아니지만 한 문자를 삭제하면
 * 회문이 되는 문자열을 말한다.
 * 
 * 주어진 문자열을 확인한 후 문자열의 종류에 따라 다음과 같이
 * 출력되는 프로그램 작성
 * 회문 : 0
 * 유사회문 : 1
 * 기타 : 2
 * @author 김한수
 *
 */
public class Practice7 {
	
	public static int solution(String str) {
		return Function(0, str.length() - 1, str.toCharArray(), 0);
	}
	
	public static int Function(int left, int right, char[] arr, int delCnt) {
		while(left < right) {
			if(arr[left] != arr[right]) {
				if(delCnt == 0) {
					if(Function(left + 1, right, arr, 1) == 0 || Function(left, right - 1, arr, 1) == 0) {
						return 1;
					} else {
						return 2;
					}
				} else {
					return 2;
				}
			} else {
				left++;
				right--;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(solution("abba"));
		System.out.println(solution("summuus"));
		System.out.println(solution("xabba"));
		System.out.println(solution("xabbay"));
		System.out.println(solution("comcom"));
		System.out.println(solution("comwwmoc"));
		System.out.println(solution("comwwtmoc"));
	}

}
