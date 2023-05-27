package mathBasic;

import java.util.ArrayList;

/**
 * 문자열 s1과 s2가 주어졌을 때,
 * s1을 permutation 한 문자열이 s2의 부분 문자열에
 * 해당하면 true를 반환하고
 * 아니면 false를 반환
 * @author 김한수
 *
 */
public class Practice3 {
	public static boolean solution1(String s1, String s2) {
		boolean[] visited = new boolean[s1.length()];
		char[] out = new char[s1.length()];
		ArrayList<String> list = new ArrayList<>();
		permutation(s1.toCharArray(), 0, s1.length(), s1.length(), visited, out, list);
		
		for(String s : list) {
			if(s2.contains(s)) {
				return true;
			}
		}
		return false;
	}

	public static void permutation(char[] arr, int depth, int n, int r, boolean[] visited, char[] out, ArrayList<String> list) {
		if(depth == r) {
			list.add(new String(out));
		}
		for(int i = 0; i < n; i++) {
			if(visited[i] != true) {
				visited[i] = true;
				out[depth] = arr[i];
				permutation(arr, depth + 1, n, r, visited, out, list);
				visited[i] = false;
			}
		}
	}
	
	public static boolean solution2(String s1, String s2) {
		int[] arr = new int[26];
		if(s1.length() > s2.length()) {
			return false;
		}
		for(int i = 0; i < s1.length(); i++) {
			arr[s1.charAt(i) - 'a']++;
		}
		for(int i = 0; i < s2.length(); i++) {
			arr[s2.charAt(i) - 'a']--;
			if(i - s1.length() >= 0) {
				arr[s2.charAt(i - s1.length()) - 'a']++;
			}
			
			boolean isZero = true;
			for(int j = 0; j < arr.length; j++) {
				if(arr[j] != 0) {
					isZero = false;
					break;
				}
			}
			if(isZero) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(solution1("ab", "adbak"));
		System.out.println(solution1("ac", "car"));
		System.out.println(solution1("ak", "aabbkk"));
		
		System.out.println(solution2("ab", "adbak"));
		System.out.println(solution2("ac", "car"));
		System.out.println(solution2("ak", "aabbkk"));
	}

}
