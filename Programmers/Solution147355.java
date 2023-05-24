package programers;

import java.util.Scanner;

public class Solution147355 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String t = in.next();
		String p = in.next();
		in.close();
		
		
		System.out.println( solution(t, p));
	}
	public static int solution(String t, String p) {
		int answer = 0;
		Long num1 = Long.parseLong(p);
		for(int i = 0; i < t.length() - p.length() + 1; i++) {
			Long num2 = Long.parseLong(t.substring(i, i + p.length()));
			if(num2 <= num1) answer++;
		}
		return answer;
	}
}
