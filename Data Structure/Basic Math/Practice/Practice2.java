package mathBasic;

import java.util.Arrays;

/**
 * 양의 정수로 이루어진 배열이 주어졌을 때
 * 해당 데이터로 만들 수 있는 pemutation 중에서 다음과 같은 
 * 데이터를 출력하는 프로그램
 * - 현재 데이터보다 이전의 큰 수 출력
 * - 한 번의 swap으로 출력 가능한 큰 수
 * - 첫 데이터는 고정
 * @author 김한수
 *
 */
public class Practice2 {
	public static void solution(int[] arr) {
		if(arr == null || arr.length < 2) {
			return;
		}
		int idx = -1;
		for(int i = arr.length - 1; i > 0; i--) {
			if(arr[i] < arr[i - 1]) {
				idx = i - 1;
				break;
			}
		}
		if(idx == -1) {
			System.out.println(Arrays.toString(arr));
			return;
		} 
		for(int i = arr.length - 1; i > idx; i--) {
			if(arr[i] < arr[idx] && arr[i] != arr[i - 1]) {
				int tmp = arr[i];
				arr[i] = arr[idx];
				arr[idx] = tmp;
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		solution(new int[] {3, 2, 1});
		solution(new int[] {1, 9, 4, 7, 6});
		solution(new int[] {1, 1, 2, 3});
	}
}
