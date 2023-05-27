package mathBasic;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 삼각형의 행의 수가 입력으로 주어졌을 때
 * 파스칼의 삼각형을 출력하시오.
 * @author 김한수
 *
 */
public class Practice1 {
	
	static ArrayList<ArrayList<Integer>> solution(int n) {
		ArrayList<ArrayList<Integer>> answer = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			ArrayList<Integer> arr = new ArrayList<>();
			for(int j = 0; j <= i; j++) {
				int pResult = 1;
				for(int k = i; k >= i - j + 1; k--) {
					pResult *= k;
				}
				int rResult = 1;
				for(int k = 1; k <= j; k++) {
					rResult *= k;
				}
				arr.add(pResult / rResult);
			}
			answer.add(arr);
		}
		return answer;
	}
	
//	다른 사람의 풀이
/*
 * public static ArrayList<ArrayList<Integer>> solution(int num) {
 * 	ArrayList<ArrayList<Integer>> result = new ArrayList<>();
 * 	
 * 	for(int i = 0; i < num; i++ ) {
 * 		ArrayList<Integer> list = new ArrayList<>();
 * 		
 * 		for(int j = 0; j < i + 1; j++) {
 * 			if(j == 0 || j == 1) {
 * 				list.add(1);
 * 			} else {
 * 				int x = result.get(i - 1).get(j - 1); 
 * 				int y = result.get(i - 1).get(j);
 * 				list.add(x + y);
 * 			}
 * 		}
 * 		result.add(list);
 * 	}
 * 	return result;
 * }
 */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(solution(in.nextInt()));
		in.close();
	}

}
