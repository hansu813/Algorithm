package data_structure;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Palindrome 찾기
 * Palindrome이면 true, 아니면 false를 반환
 * 
 * 입출력 예시 )
 * 입력 : a
 * 결과 : true
 * 
 * 입력 : abab
 * 결과 : false
 * @author 김한수
 *
 */
public class PracticeDeque02 {
	public static boolean checkPalindrome(String str) {
		Deque<String> deque = new ArrayDeque<>();
		boolean isPalindrome = true;
		
		for(String s : str.split("")) {
			deque.addFirst(s);
		}
		
		while(!deque.isEmpty()) {
			String s1 = (String)deque.pollFirst();
			String s2 = (String)deque.pollLast();
			
			if(s1 != null && s2 != null && !s1.equals(s2)) {
				isPalindrome = false;
				break;
			}
		}
		
		return isPalindrome;
	}

	public static void main(String[] args) {
//		Test code
		System.out.println(checkPalindrome("a"));		//true
		System.out.println(checkPalindrome("aba"));		//true
		System.out.println(checkPalindrome("abba"));	//true
		System.out.println(checkPalindrome("abab"));	//false
		System.out.println(checkPalindrome("abcba"));	//true
		System.out.println(checkPalindrome("abccba"));	//true
		System.out.println(checkPalindrome("madam"));	//true
	}

}
