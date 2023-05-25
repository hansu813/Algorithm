package mathBasic;

public class Combination {

	static int getComination(int n, int r) {
		int pResult = 1;
		for(int i = n; i >= n-r+1; i--) {
			pResult *= i;
		}
		
		int rResult = 1;
		for(int i = 1; i <= r; i++) {
			rResult *= i;
		}
		return pResult / rResult;
	}
	
//	1, 2, 3, 4를 이용하여 세자리 자연수 만들기
	void combination(int[] arr, boolean[] visited, int depth, int n, int r) {
		
		if(r == 0) {
			for(int i = 0; i < n; i++) {
				if(visited[i]) {
					System.out.print(arr[i] + " ");
				}
			}
			System.out.println();
			return;
		}
		
		if(depth == n) {
			return;
		}
		
		visited[depth] = true;
		combination(arr, visited, depth + 1, n, r - 1);
		
		visited[depth] = false;
		combination(arr, visited, depth + 1, n, r);
	}
	
	public static void main(String[] args) {
//		1. 조합
//		서로 다른 4명 중 주번 2명을 뽑아야 할 때
		System.out.println("=== 조합 ===");
		int n = 4;
		int r = 2;
		
		int pResult = 1;
		for(int i = n; i >= n - r + 1; i--) {
			pResult *= i;
		}
		
		int rResult = 1;
		for(int i = 1; i <= r; i++) {
			rResult *= i;
		}
		System.out.println("result : " + pResult / rResult);
		
//		2. 중복 조합
//		후보 2명, 유권자 3명일 때 무기명 투표 경우의 수
		System.out.println("=== 중복 조합 ===");
		n = 2;
		r = 3;
		
		System.out.println("결과 : " + getComination(n + r - 1, r));
		
//		1, 2, 3, 4를 이용하여 세자리 자연수
		int[] arr = {1, 2, 3, 4};
		boolean[] visited = {false, false, false, false};
		
		Combination c = new Combination();
		c.combination(arr, visited, 0, 4, 3);
 	}

}
