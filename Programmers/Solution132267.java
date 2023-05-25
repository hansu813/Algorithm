package programers;

public class Solution132267 {
	
	public static int solution(int a, int b, int n) {
		int answer = 0;
		int remNum = 0;
		while(n >= a) {
				if(n % a == 0) {
					n = n / a * b;
					answer += n;
					System.out.println(n);
				} else {
					remNum = n % a;
					n = n / a * b;
					answer += n;
					n += remNum;
					System.out.println(n);
				}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(3, 1, 20));
	}

}
