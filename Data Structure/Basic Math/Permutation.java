package mathBasic;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;
/**
 * 순열
 * @author 김한수
 *
 */
public class Permutation {
//	1번째 방법
	void permutation(int[] arr, int depth, int n, int r) {
		if(depth == r) {
			for(int i = 0; i < r; i ++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		for(int i = depth; i < n; i++) {
			swap(arr, depth, i);
			permutation(arr, depth + 1, n, r);
			swap(arr, depth, i);
		}
	}
	
	void swap(int[] arr, int depth, int idx) {
		int tmp = arr[depth];
		arr[depth] = arr[idx];
		arr[idx] = tmp;
	}
	
//	2번째 방법
	void permutation(int[] arr, int depth, int n, int r, boolean[] visited, int[] out) {
		if(depth == r) {
			System.out.println(Arrays.toString(out));
			return;
		}
		for(int i = 0; i < n; i++) {
			if(visited[i] != true) {
				visited[i] = true;
				out[depth] = arr[i];
				permutation(arr, depth + 1, n, r, visited, out);
				visited[i] = false;
			}
		}
	}

	public static void main(String[] args) {
//		1. 팩토리얼
		System.out.println("=== 팩토리얼 ===");
		int n = 5;
		int result = 1;
		
		for(int i = 1; i <= n; i++) {
			result *= i;
		}
		System.out.println(result);
		System.out.println(IntStream.range(2, 6).reduce(1, (x, y) -> (x * y)));
		
//		2. 순열
		System.out.println("=== 순열 ===");
		n = 5;
		int r = 3;
		result = 1;
		for(int i = n; i >= n - r + 1; i++) {
			result *= i;
		}
		System.out.println(result);
		
//		3. 중복 순열
		System.out.println("=== 중복 순열 ===");
		n = 4;
		r = 2;
		result = 1;
		
		for(int i = 0; i < r; i++) {
			result *= n;
		}
		System.out.println(result);
		System.out.println(Math.pow(n, r));
		
//		4.원 순열
		System.out.println("=== 원 순열 ===");
		n = 3;
		result = 1;
		for(int i = 1; i < n; i++) {
			result *= i;
		}
		System.out.println(result);
		
//		Test Code 1
		int[] arr = {1, 2, 3, 4};
		
		Permutation p1 = new Permutation();
		p1.permutation(arr, 0, 4, 3);
		
//		Test Code 2
		n = 4;
		r = 3;
		boolean[] visited = new boolean[n];
		int[] out = new int[r];
		
		Permutation p2 = new Permutation();
		p2.permutation(arr, 0, n, r, visited, out);
	}

}
